package com.example.aptitudetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class Results extends AppCompatActivity {
    private resultslib mResultsLibrary = new resultslib();

    private TextView resultHeading,resultContent,resultInterestPercentage;
    int HealthCareOptions[] = {44,45,59,21,31};
    int CommunicationOptions[] = {24,40};
    int TradeVocationsOptions[] ={29,58};
    int SocialScienceOptions[] ={55,26,41};
    int MultiMediaOptions[] = {10,22,25};
    int EducationOptions[] ={9,39,53};
    int BusinessOptions[] ={2,32,47,17,54};
    int FinanceOptions[] ={1,16,31,46};
    int PublicServiceOptions[] = {6,15,51,35};
    int LegalOptions[] = {5,20,36,50};
    int ArtsOptions[] = {7,37,52,34};
    int ScienceOptions[] = {12,27,56,42};
    int CulinaryOptions[] = {8,38,23,60};
    int TechnologyOptions[] = {33,48,14,28,57};
    int EngineeringOptions[] = {3,4,13,18,19,43,48};
    ArrayList<Integer> contain = new ArrayList<>();

    ArrayList<Float> total = new ArrayList<Float>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultHeading = (TextView) findViewById(R.id.resultHeading);
        resultContent = (TextView) findViewById(R.id.resultContent);

        contain.add(1);
        contain.add(2);
        contain.add(3);
        contain.add(4);

        resultContent.setMovementMethod(new ScrollingMovementMethod());

        Intent intent=getIntent();
        ArrayList<Integer> mQuestionChoice = (ArrayList<Integer>) getIntent().getSerializableExtra("mQuestionChoice");


        if(contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(21)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(30)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(59)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(45)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(44)))))
        {
            int healthcareveryinterested =0,healthcareinterested =0,healthcareslightlyinterested=0,healthcarenotinterested=0;
            float healthcareinterestpercentage=1;
            for(int i=0;i<HealthCareOptions.length;i++)
            {
                if(Integer.parseInt(String.valueOf(mQuestionChoice.get(HealthCareOptions[i]))) == 1)
                {
                    healthcareveryinterested +=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(HealthCareOptions[i]))) == 2)
                {
                    healthcareinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(HealthCareOptions[i]))) == 3)
                {
                    healthcareslightlyinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(HealthCareOptions[i]))) == 4)
                {
                    healthcarenotinterested+=1;
                }
            }
           float healthcaretotal = (healthcareveryinterested*4 + healthcareinterested*3 + healthcareslightlyinterested*2 + healthcarenotinterested*1);
            healthcareinterestpercentage = (healthcaretotal/20)*100;
            total.add(healthcareinterestpercentage);

        }

        if(contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(12)))) &&  contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(27)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(56)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(42)))))
        {
            int scienceveryinterested=0,scienceinterested=0,scienceslightlyinterested=0,sciencenotinterested=0;
            float scienceinterestPercentage=1;
            for(int i=0;i<ScienceOptions.length;i++)
            {
                if(Integer.parseInt(String.valueOf(mQuestionChoice.get(ScienceOptions[i]))) == 1)
                {
                    scienceveryinterested +=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(ScienceOptions[i]))) == 2)
                {
                    scienceinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(ScienceOptions[i]))) == 3)
                {
                    scienceslightlyinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(ScienceOptions[i]))) == 4)
                {
                    sciencenotinterested+=1;
                }
            }
            float sciencetotal = (scienceveryinterested*4 + scienceinterested*3 + scienceslightlyinterested*2 + sciencenotinterested *1);
            scienceinterestPercentage = (sciencetotal/16)*100;
            total.add(scienceinterestPercentage);
        }

        if(contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(8)))) &&  contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(23)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(38)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(60)))))
        {
            int culinaryveryinterested=0,culinaryinterested=0,culinaryslightlyinterested=0,culinarynotinterested=0;
            float culinaryinterestPercentage=1;
            for(int i=0;i<CulinaryOptions.length;i++)
            {
                if(Integer.parseInt(String.valueOf(mQuestionChoice.get(CulinaryOptions[i]))) == 1)
                {
                    culinaryveryinterested +=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(CulinaryOptions[i]))) == 2)
                {
                    culinaryinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(CulinaryOptions[i]))) == 3)
                {
                    culinaryslightlyinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(CulinaryOptions[i]))) == 4)
                {
                    culinarynotinterested+=1;
                }
            }
            float culinarytotal = (culinaryveryinterested*4 + culinaryinterested*3 + culinaryslightlyinterested*2 + culinarynotinterested *1);
            culinaryinterestPercentage = (culinarytotal/16)*100;
            total.add(culinaryinterestPercentage);

        }

        if(contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(1)))) &&  contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(16)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(46)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(31)))))

        {
            int financeveryinterested=0,financeinterested=0,financeslightlyinterested=0,financenotinterested=0;
            float financeinterestPercentage=1;
            for(int i=0;i<FinanceOptions.length;i++)
            {
                if(Integer.parseInt(String.valueOf(mQuestionChoice.get(FinanceOptions[i]))) == 1)
                {
                    financeveryinterested +=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(FinanceOptions[i]))) == 2)
                {
                    financeinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(FinanceOptions[i]))) == 3)
                {
                    financeslightlyinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(FinanceOptions[i]))) == 4)
                {
                    financenotinterested+=1;
                }
            }
            float financetotal = (financeveryinterested*4 + financeinterested*3 + financeslightlyinterested*2 + financenotinterested *1);
            financeinterestPercentage = (financetotal/16)*100;
            total.add(financeinterestPercentage);
        }

        if(contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(33)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(48)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(14)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(28)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(57)))))
        {
            int technologyveryinterested=0,technologyinterested=0,technologyslightlyinterested=0,technologynotinterested=0;
            float technologyinterestPercentage=1;
            for(int i=0;i<TechnologyOptions.length;i++)
            {
                if(Integer.parseInt(String.valueOf(mQuestionChoice.get(TechnologyOptions[i]))) == 1)
                {
                    technologyveryinterested +=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(TechnologyOptions[i]))) == 2)
                {
                    technologyinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(TechnologyOptions[i]))) == 3)
                {
                    technologyslightlyinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(TechnologyOptions[i]))) == 4)
                {
                    technologynotinterested+=1;
                }
            }
            float technologytotal = (technologyveryinterested*4 + technologyinterested*3 + technologyslightlyinterested*2 + technologynotinterested *1);
            technologyinterestPercentage = (technologytotal/20)*100;
            total.add(technologyinterestPercentage);

        }

        if(contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(9)))) &&  contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(39)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(53)))))

        {
            int educationveryinterested=0,educationinterested=0,educationslightlyinterested=0,educationnotinterested=0;
            float educationinterestPercentage=1;
            for(int i=0;i<EducationOptions.length;i++)
            {
                if(Integer.parseInt(String.valueOf(mQuestionChoice.get(EducationOptions[i]))) == 1)
                {
                    educationveryinterested +=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(EducationOptions[i]))) == 2)
                {
                    educationinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(EducationOptions[i]))) == 3)
                {
                    educationslightlyinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(EducationOptions[i]))) == 4)
                {
                    educationnotinterested+=1;
                }
            }
            float educationtotal = (educationveryinterested*4 + educationinterested*3 + educationslightlyinterested*2 + educationnotinterested *1);
            educationinterestPercentage = (educationtotal/12)*100;
            total.add(educationinterestPercentage);

        }

        if(contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(40)))) &&  contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(24)))))

        {
            int communicationveryinterested=0,communicationinterested=0,communicationslightlyinterested=0,communicationnotinterested=0;
            float communicationinterestPercentage;
            for(int i=0;i<CommunicationOptions.length;i++)
            {
                if(Integer.parseInt(String.valueOf(mQuestionChoice.get(CommunicationOptions[i]))) == 1)
                {
                    communicationveryinterested +=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(CommunicationOptions[i]))) == 2)
                {
                    communicationinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(CommunicationOptions[i]))) == 3)
                {
                    communicationslightlyinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(CommunicationOptions[i]))) == 4)
                {
                    communicationnotinterested+=1;
                }
            }
            float communicationtotal = (communicationveryinterested*4 + communicationinterested*3 + communicationslightlyinterested*2 + communicationnotinterested *1);
            communicationinterestPercentage = (communicationtotal/8)*100;
            total.add(communicationinterestPercentage);

        }

        if(contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(2)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(32)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(47)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(17)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(54)))))
        {
            int businessveryinterested=0,businessinterested=0,businessslightlyinterested=0,businessnotinterested=0;
            float businessinterestPercentage=1;
            for(int i=0;i<BusinessOptions.length;i++)
            {
                if(Integer.parseInt(String.valueOf(mQuestionChoice.get(BusinessOptions[i]))) == 1)
                {
                    businessveryinterested +=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(BusinessOptions[i]))) == 2)
                {
                    businessinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(BusinessOptions[i]))) == 3)
                {
                    businessslightlyinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(BusinessOptions[i]))) == 4)
                {
                    businessnotinterested+=1;
                }
            }
            float businesstotal = (businessveryinterested*4 + businessinterested*3 + businessslightlyinterested*2 + businessnotinterested *1);
            businessinterestPercentage = (businesstotal/20)*100;
            total.add(businessinterestPercentage);
        }


        if(contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(10)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(22)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(25)))))
        {
            int multimediaveryinterested=0,multimediainterested=0,multimediaslightlyinterested=0,multimedianotinterested=0;
            float multimediainterestPercentage=1;
            for(int i=0;i<MultiMediaOptions.length;i++)
            {
                if(Integer.parseInt(String.valueOf(mQuestionChoice.get(MultiMediaOptions[i]))) == 1)
                {
                    multimediaveryinterested +=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(MultiMediaOptions[i]))) == 2)
                {
                    multimediainterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(MultiMediaOptions[i]))) == 3)
                {
                    multimediaslightlyinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(MultiMediaOptions[i]))) == 4)
                {
                    multimedianotinterested+=1;
                }
            }
            float multimediatotal = (multimediaveryinterested*4 + multimediainterested*3 + multimediaslightlyinterested*2 + multimedianotinterested *1);
            multimediainterestPercentage = (multimediatotal/12)*100;
            total.add(multimediainterestPercentage);

        }

        if(contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(5)))) &&  contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(20)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(36)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(50)))))

        {
            int legalveryinterested=0,legalinterested=0,legalslightlyinterested=0,legalnotinterested=0;
            float legalinterestPercentage=1;
            for(int i=0;i<LegalOptions.length;i++)
            {
                if(Integer.parseInt(String.valueOf(mQuestionChoice.get(LegalOptions[i]))) == 1)
                {
                    legalveryinterested +=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(LegalOptions[i]))) == 2)
                {
                    legalinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(LegalOptions[i]))) == 3)
                {
                    legalslightlyinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(LegalOptions[i]))) == 4)
                {
                    legalnotinterested+=1;
                }
            }
            float legaltotal = (legalveryinterested*4 + legalinterested*3 + legalslightlyinterested*2 + legalnotinterested *1);
            legalinterestPercentage = (legaltotal/16)*100;
            total.add(legalinterestPercentage);
        }

        if(contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(7)))) &&  contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(37)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(52)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(34)))))
        {
            int artsveryinterested=0,artsinterested=0,artsslightlyinterested=0,artsnotinterested=0;
            float artsinterestPercentage=1;
            for(int i=0;i<ArtsOptions.length;i++)
            {
                if(Integer.parseInt(String.valueOf(mQuestionChoice.get(ArtsOptions[i]))) == 1)
                {
                    artsveryinterested +=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(ArtsOptions[i]))) == 2)
                {
                    artsinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(ArtsOptions[i]))) == 3)
                {
                    artsslightlyinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(ArtsOptions[i]))) == 4)
                {
                    artsnotinterested+=1;
                }
            }
            float artstotal = (artsveryinterested*4 + artsinterested*3 + artsslightlyinterested*2 + artsnotinterested *1);
            artsinterestPercentage = (artstotal/16)*100;
            total.add(artsinterestPercentage);
        }

        if(contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(6)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(15)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(51)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(35)))))
        {
            int publicserviceveryinterested=0,publicserviceinterested=0,publicserviceslightlyinterested=0,publicservicenotinterested=0;
            float publicserviceinterestPercentage=1;
            for(int i=0;i<PublicServiceOptions.length;i++)
            {
                if(Integer.parseInt(String.valueOf(mQuestionChoice.get(PublicServiceOptions[i]))) == 1)
                {
                    publicserviceveryinterested +=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(PublicServiceOptions[i]))) == 2)
                {
                    publicserviceinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(PublicServiceOptions[i]))) == 3)
                {
                    publicserviceslightlyinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(PublicServiceOptions[i]))) == 4)
                {
                    publicservicenotinterested+=1;
                }
            }
            float publicservicetotal = (publicserviceveryinterested*4 + publicserviceinterested*3 + publicserviceslightlyinterested*2 + publicservicenotinterested *1);
            publicserviceinterestPercentage = (publicservicetotal/16)*100;
            total.add(publicserviceinterestPercentage);
        }

        if(contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(55)))) &&  contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(26)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(41)))))
        {
            int socialscienceveryinterested=0,socialscienceinterested=0,socialscienceslightlyinterested=0,socialsciencenotinterested=0;
            float socialscienceinterestPercentage=1;
            for(int i=0;i<SocialScienceOptions.length;i++)
            {
                if(Integer.parseInt(String.valueOf(mQuestionChoice.get(SocialScienceOptions[i]))) == 1)
                {
                    socialscienceveryinterested +=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(SocialScienceOptions[i]))) == 2)
                {
                    socialscienceinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(SocialScienceOptions[i]))) == 3)
                {
                    socialscienceslightlyinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(SocialScienceOptions[i]))) == 4)
                {
                    socialsciencenotinterested+=1;
                }
            }
            float socialsciencetotal = (socialscienceveryinterested*4 + socialscienceinterested*3 + socialscienceslightlyinterested*2 + socialsciencenotinterested*1);
            socialscienceinterestPercentage = (socialsciencetotal/12)*100;
            total.add(socialscienceinterestPercentage);

        }

        if(contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(3)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(4)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(13)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(18)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(19)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(43)))) && contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(49))))){

            int engineeringveryinterested=0,engineeringinterested=0,engineeringslightlyinterested=0,engineeringnotinterested=0;
            float engineeringinterestPercentage=1;
            for(int i=0;i<EngineeringOptions.length;i++)
            {
                if(Integer.parseInt(String.valueOf(mQuestionChoice.get(EngineeringOptions[i]))) == 1)
                {
                    engineeringveryinterested +=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(EngineeringOptions[i]))) == 2)
                {
                    engineeringinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(EngineeringOptions[i]))) == 3)
                {
                    engineeringslightlyinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(EngineeringOptions[i]))) == 4)
                {
                    engineeringnotinterested+=1;
                }
            }
            float engineeringtotal = (engineeringveryinterested*4 + engineeringinterested*3 + engineeringslightlyinterested*2 + engineeringnotinterested *1);
            engineeringinterestPercentage = (engineeringtotal/28)*100;
            total.add(engineeringinterestPercentage);

        }

        if(contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(29)))) &&  contain.contains(Integer.parseInt(String.valueOf(mQuestionChoice.get(58)))))
         {
             int tradevocationsveryinterested=0,tradevocationsinterested=0,tradevocationsslightlyinterested=0,tradevocationsnotinterested=0;
             float tradevocationsinterestPercentage=1;
             for(int i=0;i<TradeVocationsOptions.length;i++)
            {
                if(Integer.parseInt(String.valueOf(mQuestionChoice.get(TradeVocationsOptions[i]))) == 1)
                {
                    tradevocationsveryinterested +=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(TradeVocationsOptions[i]))) == 2)
                {
                    tradevocationsinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(TradeVocationsOptions[i]))) == 3)
                {
                    tradevocationsslightlyinterested+=1;
                }
                else if(Integer.parseInt(String.valueOf(mQuestionChoice.get(TradeVocationsOptions[i]))) == 4)
                {
                    tradevocationsslightlyinterested+=1;
                }
            }
             float tradetotal = (tradevocationsveryinterested*4 + tradevocationsinterested*3 + tradevocationsslightlyinterested*2 + tradevocationsnotinterested *1);
             tradevocationsinterestPercentage = (tradetotal/8)*100;
             total.add(tradevocationsinterestPercentage);
        }


        for(int i=0; i < total.size(); i++){
            resultContent.setText(resultContent.getText() + getResources().getString(R.string.interestpercentage) + total.get(i) + getResources().getString(R.string.percentage) +"\n" +mResultsLibrary.getDescription(i)+ "\n");
        }
    }
}
