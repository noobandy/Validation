/**
 * 
 */
package in.anandm.android.utils.validator;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.widget.EditText;

/**
 * @author anandm
 * 
 */
public class BindingResults {

	private List<BindingError> mErrors = new ArrayList<BindingError>();
	private BindingErrorRenderer mBindingErrorRenderer;
	private Activity mActivity;

	public BindingResults(BindingErrorRenderer mBindingErrorRenderer,
			Activity mActivity) {
		super();
		this.mBindingErrorRenderer = mBindingErrorRenderer;
		this.mActivity = mActivity;
	}

	public void rejectValue(EditText view, String message) {
		mErrors.add(new BindingError(view, message));

	}

	public List<BindingError> getErrors() {
		return mErrors;
	}

	public boolean isValid() {
		boolean isValid = true;
		mBindingErrorRenderer.clear();

		if (!mErrors.isEmpty()) {
			BindingError firstBindingError = mErrors.get(0);
			EditText textView = firstBindingError.getView();
			textView.requestFocus();
			textView.selectAll();

			BindingResultsUtils.showKeyboard(mActivity, textView);

			mBindingErrorRenderer.showErrorMessage(firstBindingError);

			isValid = false;
		}

		return isValid;
	}
}
