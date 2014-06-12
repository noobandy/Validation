/**
 * 
 */
package in.anandm.android.utils.validator;

import android.widget.EditText;

/**
 * @author anandm
 *
 */
public class ValidationUtils {



	public static final void rejectIfEmptyOrWhitespace(BindingResults errors,EditText view,String message){
		if(isNull(view.getText().toString()) || isWhatSpace(view.getText().toString())){
			errors.rejectValue(view, message);
		}
	}


	public static final void rejectIfEmpty(BindingResults errors,EditText view,String message){
		if(isNull(view.getText().toString())){
			errors.rejectValue(view, message);
		}
	}


	private static final boolean isNull(String string){
		return string == null;
	}

	private static final boolean isWhatSpace(String string){
		return  !isNull(string) && "".equals(string.trim());
	}
}
