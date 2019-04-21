package fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.e.test_fragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddFragment extends Fragment implements View.OnClickListener {
    private Button btnSum;
    private EditText etNum1,etNum2;


    public AddFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_add, container, false);
        etNum1=view.findViewById(R.id.etNum1);
        etNum2=view.findViewById(R.id.etNum2);
        btnSum=view.findViewById(R.id.btnSum);

        btnSum.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        int first= Integer.parseInt(etNum1.getText().toString());
        int second= Integer.parseInt(etNum2.getText().toString());
        int result=first+second;

        Toast.makeText(getActivity(),"Sum is "+ result, Toast.LENGTH_LONG).show();
    }
}
