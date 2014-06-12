package in.anandm.android.utils.validator;

import java.util.ArrayList;
import java.util.List;

import android.widget.EditText;
import android.widget.TextView;

public class TextViewBindingErrorRenderer implements BindingErrorRenderer {

	private List<TextView> mTextViews = new ArrayList<TextView>();

	public TextViewBindingErrorRenderer() {
	}

	@Override
	public void showErrorMessage(BindingError error) {

		EditText textView = error.getView();
		mTextViews.add(textView);
		textView.setError(error.getErrorMessage());

	}

	@Override
	public void clear() {
		for (TextView textView : mTextViews) {
			textView.setError(null);
		}
		mTextViews.clear();
	}
}
