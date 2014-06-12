/**
 * 
 */
package in.anandm.android.utils.validator;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.widget.Toast;

/**
 * @author anandm
 *
 */
public class ToastBindingErrorRenderer implements BindingErrorRenderer {
	private Context mContext;
	private List<Toast> mToasts = new ArrayList<Toast>();

	public ToastBindingErrorRenderer(Context context) {
		mContext = context;
	}

	@Override
	public void showErrorMessage(BindingError error) {

		Toast toast = Toast.makeText(mContext, error.getErrorMessage(), Toast.LENGTH_SHORT);
		mToasts.add(toast);
		toast.show();

	}

	@Override
	public void clear() {
		for (Toast toast : mToasts) {
			toast.cancel();
		}
		mToasts.clear();
	}

}
