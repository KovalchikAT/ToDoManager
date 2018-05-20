package com.kovalchyk_at.todomanager.Fragments;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.kovalchyk_at.todomanager.Helper.Authentication;
import com.kovalchyk_at.todomanager.Helper.DBHelper;
import com.kovalchyk_at.todomanager.Model.Address;
import com.kovalchyk_at.todomanager.Model.User;
import com.kovalchyk_at.todomanager.R;

public class FragmentUserDetail extends Fragment {

    private TextView saveUserDataButton;
    private Button chooseUserPhotoButton;
    private Button chooseGeoFromMapButton;

    private AutoCompleteTextView userSurnameAutoCompleteTextView;
    private AutoCompleteTextView userNameAutoCompleteTextView;
    private AutoCompleteTextView userWebsiteAutoCompleteTextView;
    private AutoCompleteTextView userEmailAutoCompleteTextView;
    private AutoCompleteTextView userPhoneAutoCompleteTextView;
    private AutoCompleteTextView userCountryAutoCompleteTextView;
    private AutoCompleteTextView userCityAutoCompleteTextView;
    private AutoCompleteTextView userSuiteAutoCompleteTextView;
    private AutoCompleteTextView userRegionAutoCompleteTextView;
    private AutoCompleteTextView userStreetAutoCompleteTextView;
    private AutoCompleteTextView userZipCodeAutoCompleteTextView;
    private AutoCompleteTextView userCompanyIdAutoCompleteTextView;
    private AutoCompleteTextView userCompanyNameAutoCompleteTextView;
    private AutoCompleteTextView userPositionAutoCompleteTextView;
    private AutoCompleteTextView userPositionIdAutoCompleteTextView;
    private ImageView logoImageView;

    private DBHelper helper;

    private User readUserFromView() {
        User user = new User();

        return new User(Authentication.getCurrentUserId(),
                userNameAutoCompleteTextView.getText().toString(),
                userSurnameAutoCompleteTextView.getText().toString(),
                userEmailAutoCompleteTextView.getText().toString(),
                new Address(userCountryAutoCompleteTextView.getText().toString(),
                        userRegionAutoCompleteTextView.getText().toString(),
                        userCityAutoCompleteTextView.getText().toString(),
                        userStreetAutoCompleteTextView.getText().toString(),
                        userSuiteAutoCompleteTextView.getText().toString(),
                        userZipCodeAutoCompleteTextView.getText().toString(),
                        0,0),
                userPhoneAutoCompleteTextView.getText().toString(),
                userWebsiteAutoCompleteTextView.getText().toString(),
                userPositionIdAutoCompleteTextView.getText().toString(),
                userCompanyIdAutoCompleteTextView.getText().toString(),
                userCompanyNameAutoCompleteTextView.getText().toString(),
                userPositionAutoCompleteTextView.getText().toString()
                );
    }

    /**
     * @param user show user data
     */
    private void showUserFromDB(User user) {
        userSurnameAutoCompleteTextView.setText(user.getUserSurname());
        userNameAutoCompleteTextView.setText(user.getUserName());
        userWebsiteAutoCompleteTextView.setText(user.getUserWebsite());
        userEmailAutoCompleteTextView.setText(user.getUserEmail());
        userPhoneAutoCompleteTextView.setText(user.getUserPhone());
        userCountryAutoCompleteTextView.setText(user.getUserAddress().getCountry());
        userCityAutoCompleteTextView.setText(user.getUserAddress().getCity());
        userSuiteAutoCompleteTextView.setText(user.getUserAddress().getSuite());
        userRegionAutoCompleteTextView.setText(user.getUserAddress().getRegion());
        userStreetAutoCompleteTextView.setText(user.getUserAddress().getStreet());
        userZipCodeAutoCompleteTextView.setText(user.getUserAddress().getZipcode());
        userCompanyIdAutoCompleteTextView.setText(user.getUserCompanyId());
        userCompanyNameAutoCompleteTextView.setText(user.getUserCompany());
        userPositionAutoCompleteTextView.setText(user.getUserPosition());
        userPositionIdAutoCompleteTextView.setText(user.getUserPositionId());
    }

    private void initViews(View retView) {
        saveUserDataButton = retView.findViewById(R.id.saveUserDataTextView);
        chooseUserPhotoButton = retView.findViewById(R.id.chooseUserPhotoButton);
        chooseGeoFromMapButton = retView.findViewById(R.id.chooseUserGeoButton);

        userSurnameAutoCompleteTextView = retView.findViewById(R.id.userSurnemeAutoCompleteTextView);
        userNameAutoCompleteTextView = retView.findViewById(R.id.userNameAutoCompleteTextView);
        userWebsiteAutoCompleteTextView = retView.findViewById(R.id.userWebsiteAutoCompleteTextView);
        userEmailAutoCompleteTextView = retView.findViewById(R.id.userEmailAutoCompleteTextView);
        userPhoneAutoCompleteTextView = retView.findViewById(R.id.userPhoneAutoCompleteTextView);
        userCountryAutoCompleteTextView = retView.findViewById(R.id.userCountryAutoCompleteTextView);
        userCityAutoCompleteTextView = retView.findViewById(R.id.userCountryAutoCompleteTextView);
        userSuiteAutoCompleteTextView = retView.findViewById(R.id.userSuiteCompleteTextView);
        userRegionAutoCompleteTextView = retView.findViewById(R.id.userRegionAutoCompleteTextView);
        userStreetAutoCompleteTextView = retView.findViewById(R.id.userStreetCompleteTextView);
        userZipCodeAutoCompleteTextView = retView.findViewById(R.id.userZipCodeAutoCompleteTextView);
        userCompanyIdAutoCompleteTextView = retView.findViewById(R.id.userCompanyIdAutoCompleteTextView);
        userCompanyNameAutoCompleteTextView = retView.findViewById(R.id.userCompanyNameAutoCompleteTextView);
        userPositionAutoCompleteTextView = retView.findViewById(R.id.userPositionAutoCompleteTextView);
        userPositionIdAutoCompleteTextView = retView.findViewById(R.id.userPositionIdAutoCompleteTextView);
    }

}
