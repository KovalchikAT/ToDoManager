package com.kovalchyk_at.todomanager.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.kovalchyk_at.todomanager.Helper.Authentication;
import com.kovalchyk_at.todomanager.Helper.DBHelper;
import com.kovalchyk_at.todomanager.Model.Company;
import com.kovalchyk_at.todomanager.R;

public class FragmentCompanyDetail extends Fragment {

    private TextView saveCompanyDataButton;
    private Button chooseCompanyLogoButton;
    private Button chooseGeoFromMapButton;
    private AutoCompleteTextView companyNameAutoCompleteTextView;
    private AutoCompleteTextView companyIdAutoCompleteTextView;
    private AutoCompleteTextView companyWebsiteAutoCompleteTextView;
    private AutoCompleteTextView companyEmailAutoCompleteTextView;
    private AutoCompleteTextView companyPhoneAutoCompleteTextView;
    private AutoCompleteTextView companyCountryAutoCompleteTextView;
    private AutoCompleteTextView companyCityAutoCompleteTextView;
    private AutoCompleteTextView companySuiteAutoCompleteTextView;
    private AutoCompleteTextView companyRegionAutoCompleteTextView;
    private AutoCompleteTextView companyStreetAutoCompleteTextView;
    private AutoCompleteTextView companyZipCodeAutoCompleteTextView;
    private ImageView logoImageView;

    private DBHelper helper;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View retV = inflater.inflate(R.layout.fragment_company_detail, null);
        initViews(retV);
        helper = new DBHelper(getActivity().getApplicationContext());

        saveCompanyDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //helper.createNewCompany(readCompanyFromView());
             //showCompanyFromDB(helper.getCompany(companyIdAutoCompleteTextView.getText().toString()));
             showCompanyFromDB(helper.getCompany("0"));
            }
        });

        return retV;
    }

    Company readCompanyFromView() {
        return new Company(companyIdAutoCompleteTextView.getText().toString(),
                companyNameAutoCompleteTextView.getText().toString(),
                companyPhoneAutoCompleteTextView.getText().toString(),
                companyEmailAutoCompleteTextView.getText().toString(),
                companyWebsiteAutoCompleteTextView.getText().toString(),
                companyCountryAutoCompleteTextView.getText().toString(),
                companyRegionAutoCompleteTextView.getText().toString(),
                companyCityAutoCompleteTextView.getText().toString(),
                companyStreetAutoCompleteTextView.getText().toString(),
                companySuiteAutoCompleteTextView.getText().toString(),
                companyZipCodeAutoCompleteTextView.getText().toString(),
                0,0);
    }

    void showCompanyFromDB(Company company){
        companyIdAutoCompleteTextView.setText(company.getCompanyId());
        companyNameAutoCompleteTextView.setText(company.getCompanyName());
        companyPhoneAutoCompleteTextView.setText(company.getCompanyPhone());
        companyEmailAutoCompleteTextView.setText(company.getCompanyEmail());
        companyWebsiteAutoCompleteTextView.setText(company.getCompanyWebsite());
        companyCountryAutoCompleteTextView.setText(company.getCompanyAddress().getCountry());
        companyRegionAutoCompleteTextView.setText(company.getCompanyAddress().getRegion());
        companyCityAutoCompleteTextView.setText(company.getCompanyAddress().getCity());
        companyStreetAutoCompleteTextView.setText(company.getCompanyAddress().getStreet());
        companySuiteAutoCompleteTextView.setText(company.getCompanyAddress().getSuite());
        companyZipCodeAutoCompleteTextView.setText(company.getCompanyAddress().getZipcode());

    }

    protected void initViews(View retV) {
        saveCompanyDataButton = retV.findViewById(R.id.saveCompanyDataTextView);
        chooseCompanyLogoButton = retV.findViewById(R.id.chooseCompanyLogoButton);
        chooseGeoFromMapButton = retV.findViewById(R.id.chooseCompanyGeoButton);

        logoImageView = retV.findViewById(R.id.companyLogoImgView);

        companyNameAutoCompleteTextView = retV.findViewById(R.id.companyNameAutoCompleteTextView);
        companyIdAutoCompleteTextView = retV.findViewById(R.id.companyIdAutoCompleteTextView);
        companyWebsiteAutoCompleteTextView = retV.findViewById(R.id.companyWebsiteAutoCompleteTextView);
        companyEmailAutoCompleteTextView = retV.findViewById(R.id.companyEmailAutoCompleteTextView);
        companyPhoneAutoCompleteTextView = retV.findViewById(R.id.companyPhoneAutoCompleteTextView);
        companyCountryAutoCompleteTextView = retV.findViewById(R.id.companyCountryAutoCompleteTextView);
        companyCityAutoCompleteTextView = retV.findViewById(R.id.companyCityAutoCompleteTextView);
        companySuiteAutoCompleteTextView = retV.findViewById(R.id.companySuiteAutoCompleteTextView);
        companyRegionAutoCompleteTextView = retV.findViewById(R.id.companyRegionAutoCompleteTextView);
        companyStreetAutoCompleteTextView = retV.findViewById(R.id.companyStreetCompleteTextView);
        companyZipCodeAutoCompleteTextView = retV.findViewById(R.id.companyZipCodeAutoCompleteTextView);
    }
}
