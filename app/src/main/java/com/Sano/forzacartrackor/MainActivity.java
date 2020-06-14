package com.Sano.forzacartrackor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        ArrayList<mvDT> itemsList;
        movieAdapter mvDTAdapterView;
    private AdView adView;
        ListView moviesListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialize the Audience Network SDK
        AudienceNetworkAds.initialize(this);

        //     2715643862005093_2715644398671706

        adView = new AdView(this, "2715643862005093_2715644398671706", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();

        // Creating ArrayList TO store Movies Details
        itemsList = new ArrayList<>();
        moviesListView = findViewById(R.id.moviesList);







        // ============        JUST EDIT  THIS PART      ========================== //


        //  Adding movies details to arraylist
        /*
        1 - movieTitle
        2 -  Movie ReleaseDate
        3 - movieRatting
        4-movieStrotLine
        5-MoviePosterPath
        */
        //     Copy this Line and just change the data the item will automatically be added to the list .

        itemsList.add(new mvDT("2020 Acura NSX","See More Details","7.5",
                "---What’s new---\n" +
                        "\n" +
                        "1)__ The NSX carries over mostly unchanged for 2020\n\n" +
                        "2)__ Indy Yellow Pearl paint is now an available color\n\n" +
                        "3)__ Part of the second NSX generation introduced for 2017\n\n"+
                        "===Pros & Cons===\n" +
                        "\n" +
                        "1)__Accessible handling for both novice and experienced drivers\n\n" +
                        "2)__Comfortable ride and great visibility\n\n" +
                        "3)__Hybrid drivetrain provides strong acceleration and good fuel economy\n\n" +
                        "=== Cons===\n\n" +
                        "4)__Doesn't evoke much emotion\n\n" +
                        "5)__Cramped, hot cargo area\n\n" +
                        "6)__Paltry in-cabin storage\n\n" +
                        "7)__Infotainment system is clunky and outdated"
                ,R.drawable.acura));



//        ++++++++++++++++++++++++++++++++++=
        itemsList.add(new mvDT("2019 Aston Martin DB11","See More Details","7.6",
                "____What’s new____\n" +
                        "\n" +
                        "1)__New convertible body style available\n\n" +
                        "2)__Updated V12 engine, now with 630 horsepower\n\n" +
                        "3)__Part of the first DB11 generation introduced for 2017\n\n"+
                "===Pros & Cons===\n" +
                        "\n" +
                        "1)__Powerful V12 engine offers stately grand-touring character\n\n" +
                        "2)__Optional 503-hp V8 engine makes for lighter, sharper performance\n\n" +
                        "3)__Distinct and lustful design\n\n" +
                        "4)__Several colors, options and details available for personalization\n\n" +
                        "=== Cons===\n\n" +
                        "5)__Rear seats are quite small\n\n" +
                        "6)__Many common driver aids and safety features not offered"
                ,R.drawable.aston));


//  3rd +++++++++++++++++++++++++

        itemsList.add(new mvDT("2019 Audi TTS","See More Details","7.6",
                "____What’s new____\n" +
                        "\n" +
                        "1)__New seven-speed dual-clutch automatic transmission\n\n" +
                        "2)__New wireless charging pad with signal booster comes standard\n\n" +
                        "3)__New Competition package with gloss black 20-inch wheels\n\n"+
                        "4)__Part of the second Audi TTS generation introduced for 2016\n\n"+

                        "===Pros & Cons===\n" +
                        "\n" +
                        "1)__Impeccable cabin design bolstered by impressive level of technology\n\n" +
                        "2)__The turbocharged four-cylinder has plenty of power on tap\n\n" +
                        "3)__Precise handling makes it easy to maneuver in any situation\n\n" +
                        "4)__Standard all-wheel drive means it's sure-footed in any kind of weather\n\n" +
                        "=== Cons===\n\n" +
                        "1)__Not many easily accessible storage places to stash small items\n\n" +
                        "2)__Limited cargo space, so you need to pack light"
                ,R.drawable.auditts));

        //  4rd +++++++++++++++++++++++++

        itemsList.add(new mvDT("2020 BMW M2","See More Details","8.0",
                "____What’s new____\n" +
                        "\n" +
                        "1)__No significant changes for 2020\n\n" +
                        "2)__Part of the first M2 generation introduced for 2016\n\n" +


                        "===Pros & Cons===\n" +
                        "\n" +
                        "1)__Big power from the turbocharged straight-six\n\n" +
                        "2)__TLoads of fun to drive thanks to precision handling and steering\n\n" +
                        "3)__Practical enough for daily use\n\n" +
                        "4)__Low sales numbers ensures exclusivity\n\n" +
                        "=== Cons===\n\n" +
                        "1)__Overly choppy ride quality gets tiresome on bumpy roads\n\n" +
                        "2)__Few interior and exterior customization options"
                ,R.drawable.bmwcoupe));


        //  5rd +++++++++++++++++++++++++

        itemsList.add(new mvDT("2019 Cadillac ATS-V","See More Details","7.4",
                "____What’s new____\n" +
                        "\n" +
                        "1)__Sedan version has been discontinued\n\n" +
                        "2)__The ATS-V coupe carries on unchanged\n\n" +
                        "3)__Part of the first ATS-V generation introduced for 2016\n\n" +


                        "===Pros & Cons===\n" +
                        "\n" +
                        "1)__Excellent steering and handling capabilities\n\n" +
                        "2)__Turbo V6 engine generates abundant power for quick acceleration\n\n" +
                        "3)__The ATS-V is a true driver's car, built to perform on road or track\n\n" +

                        "=== Cons===\n\n" +
                        "1)__Back seat and trunk are small compared to competitors\n\n" +
                        "2)__Ride might be too punishing for some drivers\n\n"+
                "3)__Many interior controls prioritize form over function\n\n" +
                        "4)__Lacks the interior polish of most rivals"
                ,R.drawable.caddilac));

        //  6 +++++++++++++++++++++++++

        itemsList.add(new mvDT("2020 Chevrolet Camaro","See More Details","7.4",
                "____What’s new____\n" +
                        "\n" +
                        "1)__A midrange LT1 model debuts\n\n" +
                        "2)__10-speed automatic transmission is available on LT V6 models\n\n\n" +
                        "3)__Part of the sixth Camaro generation introduced for 2016\n\n" +


                        "===Pros & Cons===\n" +
                        "\n" +
                        "1)__Impressively sharp and nimble handling around turns\n\n" +
                        "2)__Potent acceleration from V6 and V8 engines\n\n" +
                        "3)__Relatively smooth ride, especially with the adaptive suspension\n\n" +
                        "4)__Solid value, thanks to a long list of standard equipment\n\n"+

                        "=== Cons===\n\n" +
                        "1)__Difficult to see out of\n\n" +
                        "2)__Tiny back seat is essentially useless\n\n"+
                        "3)__Limited trunk space with small opening\n\n" +
                        "4)__Some controls are awkward to use"
                ,R.drawable.cheverlot));


        //  7 +++++++++++++++++++++++++

        itemsList.add(new mvDT("2020 Dodge Durango","See More Details","7.7",
                "____What’s new____\n" +
                        "\n" +
                        "1)__No significant changes for 2020\n\n" +
                        "2)__Part of the third Durango generation introduced for 2011\n\n" +


                        "===Pros & Cons===\n" +
                        "\n" +
                        "1)__Large touchscreen tech interface is one of the best in class\n\n" +
                        "2)__Strong V8 power provides exceptional towing ability\n\n" +
                        "3)__Relatively smooth ride, especially with thHas real off-road capabilities with 4WD and low-range gearing\n\n" +


                        "=== Cons===\n\n" +
                        "1)__Fuel economy is below-average, especially with the V8\n\n" +
                        "2)__Bigger and bulkier to drive than rival crossover SUVs\n\n"

                ,R.drawable.dodge_dur));


        //  8 +++++++++++++++++++++++++

        itemsList.add(new mvDT("2020 Ford Mustang","See More Details","7.9",
                "____What’s new____\n" +
                        "\n" +
                        "1)__New EcoBoost (four-cylinder) Handling package available\n\n" +
                        "2)__Increased engine output with EcoBoost Performance package\n\n" +
                        "3)__FordPass Connect now standard on all Mustangs\n\n" +
                        "4)__Part of the sixth Mustang generation introduced for 2015\n\n" +


                        "===Pros & Cons===\n" +
                        "\n" +
                        "1)__Strong power from both the four-cylinder and V8 engines\n\n" +
                        "2)__Civilized ride quality and low noise levels\n\n" +
                        "3)__Cabin blends modern convenience with retro style\n\n" +


                        "=== Cons===\n\n" +
                        "1)__Impractical back seat\n\n" +
                        "2)__Performance-package ride quality can be bouncy\n\n"+
                "3)__Long, heavy doors and mediocre cabin access\n\n"

                ,R.drawable.mustang_coupe));



        //  9 +++++++++++++++++++++++++

        itemsList.add(new mvDT("2020 Honda Civic","See More Details","8.4",
                "____What’s new____\n" +
                        "\n" +
                        "1)__No significant changes for Civic sedan\n\n" +
                        "2)__Part of the 10th Civic generation introduced for 2016\n\n" +
                        "3)__Civic Si gets slightly different cabin trim and revised transmission gearing\n\n" +
                        "4)__Improved suspension and more powerful brakes for the Civic Type R\n\n" +


                        "===Pros & Cons===\n" +
                        "\n" +
                        "1)__Excellent fuel economy and performance from turbocharged engine\n\n" +
                        "2)__Ride quality expertly balances comfort and athleticism\n\n" +
                        "3)__Many standard advanced technology and safety features\n\n" +
                        "4)__Roomy cabin with high-quality materials\n\n" +


                        "=== Cons===\n\n" +
                        "1)__Overly vigilant forward collision warning system is frustrating\n\n" +
                        "2)__Slow-responding adaptive cruise control system\n\n"+
                        "3)__Blind-spot camera is harder to use than a typical blind-spot monitor\n\n"

                ,R.drawable.honda_civic));

        //  10 +++++++++++++++++++++++++

        itemsList.add(new mvDT("2020 Jaguar F-PACE","See More Details","7.8",
                "____What’s new____\n" +
                        "\n" +
                        "1)__Android Auto and Apple CarPlay now standard\n\n" +
                        "2)__Diesel engine option discontinued\n\n" +
                        "3)__Two limited-edition appearance packages available for 2020\n\n" +


                        "===Pros & Cons===\n" +
                        "\n" +
                        "1)__Available supercharged V6 delivers quick and powerful acceleration\n\n" +
                        "2)__Outdoes many rivals on cargo space\n\n" +
                        "3)__Handles and brakes like a sport sedan\n\n" +


                        "=== Cons===\n\n" +
                        "1)__Interior materials disappoint for a luxury SUV at this price\n\n" +
                        "2)__The larger the wheels, the poorer the ride comfort\n\n"+
                        "3)__More road and wind noise in the cabin than competitors\n\n"

                ,R.drawable.jaguar));

        //  11 +++++++++++++++++++++++++

        itemsList.add(new mvDT("2020 Hyundai Veloster","See More Details","8.3",
                "____What’s new____\n" +
                        "\n" +
                        "1)__Blind-spot monitoring now standard on the Turbo R-Spec\n\n" +
                        "2)__Turbo trim level adds standard wireless charging pad\n\n" +
                        "3)__Sporty handling around turns\n\n" +


                        "===Pros & Cons===\n" +
                        "\n" +
                        "1)__Unique and functional three-door body style\n\n" +
                        "2)__Enjoyable power from the Veloster's turbocharged engine\n\n" +
                        "3)__Sporty handling around turns\n\n" +


                        "=== Cons===\n\n" +
                        "1)__Base engine is down on power\n\n" +
                        "2)__Fewer trims and option packages mean fewer choices\n\n"+
                        "3)__Elevated amount of road noise\n\n"

                ,R.drawable.hyudai));


        //  12 +++++++++++++++++++++++++

        itemsList.add(new mvDT("2020 Jaguar F-PACE","See More Details","7.1",
                "____What’s new____\n" +
                        "\n" +
                        "1)__Android Auto and Apple CarPlay now standard\n\n" +
                        "2)__Diesel engine option discontinued\n\n" +
                        "3)__Two limited-edition appearance packages available for 2020\n\n" +
                        "4)__Part of the first F-Pace generation introduced for 2017\n\n" +


                        "===Pros & Cons===\n" +
                        "\n" +
                        "1)__Available supercharged V6 delivers quick and powerful acceleration\n\n" +
                        "2)__Outdoes many rivals on cargo space\n\n" +
                        "3)__Handles and brakes like a sport sedan\n\n" +


                        "=== Cons===\n\n" +
                        "1)__Interior materials disappoint for a luxury SUV at this price\n\n" +
                        "2)__The larger the wheels, the poorer the ride comfort\n\n"+
                        "3)__More road and wind noise in the cabin than competitors\n\n"

                ,R.drawable.jaguar_a));




        //  13 +++++++++++++++++++++++++

        itemsList.add(new mvDT("Jeep Grand Cherokee","See More Details","7.4",
                "____What’s new____\n" +
                        "\n" +
                        "1)__Optional diesel engine is no longer available\n\n" +
                        "2)__Part of the fourth Grand Cherokee generation introduced for 2011\n\n" +



                        "===Pros & Cons===\n" +
                        "\n" +
                        "1)__Plush interior with plentiful luxury and technology\n\n" +
                        "2)__Enough off-road ability to conquer practically any trail\n\n" +
                        "3)__Available V8 engines offer substantial power\n\n" +
                        "4)__Impressive tow ratings for the class\n\n" +


                        "=== Cons===\n\n" +
                        "1)__Firm ride quality may disappoint, even with air suspension\n\n" +
                        "2)__Underwhelming acceleration with base V6\n\n"+
                        "3)__Modest quality of cabin materials can be hard to justify\n\n"

                ,R.drawable.jeep_grand));

        //  14 +++++++++++++++++++++++++

        itemsList.add(new mvDT("Kia Stinger","See More Details","8.0",
                "____What’s new____\n" +
                        "\n" +
                        "1)__Base model now called GT-Line\n\n" +
                        "2)__Wireless charger now standard\n\n" +
                        "3)__Part of the first Kia Stinger generation introduced in 2018\n\n" +



                        "===Pros & Cons===\n" +
                        "\n" +
                        "1)__Sporty and stylish appearance stands out\n\n" +
                        "2)__Entertaining levels of performance\n\n" +
                        "3)__Refined interior with hatchback utility\n\n" +
                        "4)__Generous warranty coverage\n\n" +


                        "=== Cons===\n\n" +
                        "1)__Limited space for rear passengers\n\n" +
                        "2)__Ride quality can get a little jittery at times\n\n"+
                        "3)__Sloping roofline hampers rear visibility\n\n"

                ,R.drawable.stinger_kia));



        //  15 +++++++++++++++++++++++++

        itemsList.add(new mvDT("Mazda MX-5 Miata","See More Details","7.0",
                "____What’s new____\n" +
                        "\n" +
                        "1)__Apple CarPlay and Android Auto added to Club and Grand Touring trim levels\n\n" +
                        "2)__Forward collision mitigation and other formerly optional driver safety features are now standard\n\n" +
                        "3)__Part of the fourth MX-5 Miata generation introduced for 2016\n\n" +



                        "===Pros & Cons===\n" +
                        "\n" +
                        "1)__Extremely fun and engaging to drive, even at low speeds\n\n" +
                        "2)__One of the most fuel-efficient sports cars you can buy\n\n" +
                        "3)__Manual soft top is easy to lower or close quickly\n\n" +
                        "4)__Respectably compliant and smooth ride quality\n\n" +


                        "=== Cons===\n\n" +
                        "1)__Not much room to stretch out inside\n\n" +
                        "2)__Limited cargo space in a tiny trunk\n\n"+
                        "3)__Cabin gets fairly loud at highway speeds even with the top up\n\n"

                ,R.drawable.mazda_mix));


        //  16 +++++++++++++++++++++++++

        itemsList.add(new mvDT("Mercedes-Benz AMG GT","See More Details","8.2",
                "____What’s new____\n" +
                        "\n" +
                        "1)__New steering wheel, center console and digital instrument panel\n\n" +
                        "2)__Android Auto and Apple CarPlay availability\n\n" +
                        "3)__Part of the first AMG GT generation introduced for 2016\n\n" +



                        "===Pros & Cons===\n" +
                        "\n" +
                        "1)__Thrilling acceleration from the powerful V8\n\n" +
                        "2)__Evocative design\n\n" +
                        "3)__Comfortable ride balanced with impressive handling\n\n" +
                        "4)__Rich, sumptuous cabin\n\n" +


                        "=== Cons===\n\n" +
                        "1)__Small cabin doesn't offer much storage\n\n" +
                        "2)__Rear visibility is compromised\n\n"+
                        "3)__Infotainment interface presents a steep learning curve\n\n"

                ,R.drawable.mercedes));


        //  17 +++++++++++++++++++++++++

        itemsList.add(new mvDT("Nissan 370Z","See More Details","6.2",
                "____What’s new____\n" +
                        "\n" +
                        "1)__50th Anniversary Edition, based on the Sport trim coupe, features revised graphics and trims and removes spoiler and front lip\n\n" +
                        "2)__Part of the sixth Z generation introduced for 2009\n\n" +



                        "===Pros & Cons===\n" +
                        "\n" +
                        "1)__TSharp steering and precise handling\n\n" +
                        "2)__Pure driving experience without excessive aids and assists\n\n" +


                        "=== Cons===\n\n" +
                        "1)__Very loud with abundant road and engine noise\n\n" +
                        "2)__Difficult to drive smoothly\n\n"+
                        "3)__Base trim missing common standard features\n\n"

                ,R.drawable.nissan));



        //  18 +++++++++++++++++++++++++

        itemsList.add(new mvDT("Porsche Macan","See More Details","6.8",
                "____What’s new____\n" +
                        "\n" +
                        "1)__Macan Turbo and GTS return to the lineup with revised engines, more power\n\n" +
                        "2)__Offers optional upgrade to tungsten carbide-coated brakes\n\n" +
                        "3)__Part of the first Macan generation introduced in 2015\n\n" +



                        "===Pros & Cons===\n" +
                        "\n" +
                        "1)__Quick acceleration regardless of engine choice\n\n" +
                        "2)__Most athletic and engaging SUV in the class\n\n" +
                        "3)__Surprisingly comfortable and composed ride\n\n" +
                        "4)__Easy to customize thanks to a long list of individual options\n\n" +


                        "=== Cons===\n\n" +
                        "1)__Less rear legroom and cargo capacity than many competitors\n\n" +
                        "2)__Options and packages boost the price quickly\n\n"+
                        "3)__Four-cylinder engine is much thirstier than those in rivals\n\n"

                ,R.drawable.porshe));


        //  19 +++++++++++++++++++++++++

        itemsList.add(new mvDT("Porsche Macan","See More Details","6.8",
                "____What’s new____\n" +
                        "\n" +
                        "1)__Macan Turbo and GTS return to the lineup with revised engines, more power\n\n" +
                        "2)__Offers optional upgrade to tungsten carbide-coated brakes\n\n" +
                        "3)__Part of the first Macan generation introduced in 2015\n\n" +



                        "===Pros & Cons===\n" +
                        "\n" +
                        "1)__Quick acceleration regardless of engine choice\n\n" +
                        "2)__Most athletic and engaging SUV in the class\n\n" +
                        "3)__Surprisingly comfortable and composed ride\n\n" +
                        "4)__Easy to customize thanks to a long list of individual options\n\n" +


                        "=== Cons===\n\n" +
                        "1)__Less rear legroom and cargo capacity than many competitors\n\n" +
                        "2)__Options and packages boost the price quickly\n\n"+
                        "3)__Four-cylinder engine is much thirstier than those in rivals\n\n"

                ,R.drawable.porshe));


        //  20 +++++++++++++++++++++++++

        itemsList.add(new mvDT("Subaru WRX","See More Details","6.9",
                "____What’s new____\n" +
                        "\n" +
                        "1)__Redesigned front bumper for the WRX STI\n\n" +
                        "2)__Keyless access and push-button start now standard on the WRX STI\n\n" +
                        "3)__The WRX adds welcome lighting\n\n" +



                        "===Pros & Cons===\n" +
                        "\n" +
                        "1)__Both the WRX and the WRX STI offer swift and near best-in-class acceleration\n\n" +
                        "2)__Superb handling and steering response on twisty roads\n\n" +
                        "3)__Full-time all-wheel drive enhances traction and performance\n\n" +
                        "4)__Offers several premium safety options\n\n" +


                        "=== Cons===\n\n" +
                        "1)__Excessive wind and road noise\n\n" +
                        "2)__Interior quality lags that of competitors\n\n"+
                        "3)__STI's high-performance suspension makes for a rough ride\n\n"

                ,R.drawable.saburo));



        //  21 +++++++++++++++++++++++++

        itemsList.add(new mvDT("Subaru BRZ","See More Details","7.7",
                "____What’s new____\n" +
                        "\n" +
                        "1)__Premium base trim discontinued\n\n" +
                        "2)__New tS trim level, with upgraded handling, debuts\n\n" +
                        "3)__Part of the first BRZ generation introduced in 2013\n\n" +



                        "===Pros & Cons===\n" +
                        "\n" +
                        "1)__Balanced and forgiving handling makes for an easy and fun drive\n\n" +
                        "2)__Comfortable and supportive front seats\n\n" +
                        "3)_Better tech than what's offered by its Toyota twin\n\n" +

                        "=== Cons===\n\n" +
                        "1)__Tepid acceleration with no engine upgrade offered\n\n" +
                        "2)__Significant engine noise and freeway noise\n\n"

                ,R.drawable.saburo_coupe));


        //  22 +++++++++++++++++++++++++

        itemsList.add(new mvDT("Volkswagen Golf R","See More Details","8.6",
                "____What’s new____\n" +
                        "\n" +
                        "1)__Now available in 40 custom colors, including heritage colors\n\n" +
                        "2)__Part of the second Golf R generation introduced for 2015\n\n" +



                        "===Pros & Cons===\n" +
                        "\n" +
                        "1)__Impressive performance\n\n" +
                        "2)__Great handling without sacrificing ride quality\n\n" +
                        "3)__Interior is well-built with excellent materials\n\n" +
                        "4)__Accommodating and flexible cargo space\n\n" +


                        "=== Cons===\n\n" +
                        "1)__Outstanding performance aside, it's hard to justify the lofty price\n\n"

                ,R.drawable.volkwagon));





        // ====================================================================================================================== //

        // Adapter FOr to show data in ListView

        mvDTAdapterView= new movieAdapter(this,R.layout.list_item_layout,itemsList);

        moviesListView.setAdapter(mvDTAdapterView);


        //  when Click ON iTem Intent TO the Second ACtivity(MboeiDetailsActivity)
         final Intent secondActivityIntent =  new Intent(MainActivity.this,movieDetailActivity.class);
            moviesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    mvDT itm = itemsList.get(position);
                    secondActivityIntent.putExtra("title",itm.getMovieTitle());
                    secondActivityIntent.putExtra("RD",itm.getMovieRD());
                    secondActivityIntent.putExtra("Rating",itm.getMovieRating());
                    secondActivityIntent.putExtra("StoryLine",itm.getMovieStoryLine());
                    secondActivityIntent.putExtra("MP",itm.getMoviePosterPath());
                    startActivity(secondActivityIntent);

                }
            });
    }



    @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();

}
}
