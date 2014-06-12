/**
 * 
 */
package in.anandm.android.utils.validator;

import android.widget.EditText;

/**
 * @author anandm
 *
 */
public class BindingError {

	private EditText view;
	private String errorMessage;

	public BindingError(EditText view, String errorMessage) {
		super();
		this.view = view;
		this.errorMessage = errorMessage;
	}

	public EditText getView() {
		return view;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
