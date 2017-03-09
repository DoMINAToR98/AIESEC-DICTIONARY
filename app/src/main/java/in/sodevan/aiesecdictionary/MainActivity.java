package in.sodevan.aiesecdictionary;

import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> items,meaning;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listview);
        items=new ArrayList<>();
        items.add("AIESEC");
        items.add("AC");
        items.add("AI");
        items.add("AP GN");
        items.add("BOA");
        items.add("BUDDY");
        items.add("CEED");
        items.add("CEE GN");
        items.add("CDs");
        items.add("CT");
        items.add("CVVV");
        items.add("CY");
        items.add("DELEGATE");
        items.add("DI");
        items.add("DT");
        items.add("ES");
        items.add("ELECT");
        items.add("ET");
        items.add("GCDP");
        items.add("GGN");
        items.add("GIP");
        items.add("GN");
        items.add("GEP");
        items.add("IC");
        items.add("IG");
        items.add("ILP");
        items.add("INKIND");
        items.add("INS");
        items.add("IPM");
        items.add("IXQPS");
        items.add("LC");
        items.add("LCEB");
        items.add("LCP");
        items.add("LCVP");
        items.add("LDS");
        items.add("LEC");
        items.add("LN");
        items.add("LW");
        items.add("MCEB");
        items.add("MCP");
        items.add("MCVP");
        items.add("MT");
        items.add("MATCHED");
        items.add("OC");
        items.add("OCP");
        items.add("OPS");
        items.add("PAI");
        items.add("P -BOX");
        items.add("exchange PLENARY");
        items.add("REALIZED");
        items.add("ROLL CALL");
        items.add("RST");
        items.add("SN");
        items.add("SSGN");
        items.add("TN");
        items.add("TWIN");
        items.add("TT");
        items.add("TRAINEE");
        items.add("TRAINEESHIP");
        items.add("WENA GN");
        items.add("Y2B");
        meaning=new ArrayList<>();
        meaning.add("Association internationale des etudiants en sciences economiques et commerciales");
        meaning.add("Assessment Centre - case studies and individual tasks for students while going through selection process for membership.");
        meaning.add("AIESEC International");
        meaning.add("Asia Pacific Growth Network.");
        meaning.add("Board of Advisors.");
        meaning.add("A member who is the contact person responsible for the well-being of an intern during his or her stay in the country. ");
        meaning.add("Exchange of AIESEC members between two LCs. AIESEC members can work fora period of time in a LC abroad doing AIESEC work. Usually takes from a week to 6 months. ");
        meaning.add("Central and Eastern Europe Growth Network.");
        meaning.add("Career Days. ");
        meaning.add("Challenging Time.");
        meaning.add("Session Challengin World View.");
        meaning.add("AIESEC code for \"Country\"");
        meaning.add("Participant in a conference or seminar. Follows the complete agenda. ");
        meaning.add("Type of internship - Development Internship \n");
        meaning.add("DELHI IIT ;)");
        meaning.add("Executive Board");
        meaning.add("Name for an executive board member from the time when he or she is elected and up to the time where they take over.");
        meaning.add("Type of internship - Educational Internship. ");
        meaning.add("Global Community Development Program.");
        meaning.add("Growth Network -AIESEC countries are divided into 5 growth networks (WENA, SS, CEE, Africa and AP).");
        meaning.add("Global Internship Program.");
        meaning.add("Growth Network");
        meaning.add("Global Exchange Partner");
        meaning.add("International Congress.");
        meaning.add("Initiative group");
        meaning.add("Session Individual Learning Plan.");
        meaning.add("Products provided for free as a sponsorship.");
        meaning.add("Icelandic National Semina");
        meaning.add("International President Meeting");
        meaning.add("Exchange Quality Policies and Standards ");
        meaning.add("Local Committee.");
        meaning.add("Local Committee Executive Board. ");
        meaning.add("Local Committee President. Head of the local executive board. ");
        meaning.add("Local Committee Vice President.");
        meaning.add("Leadership Development Seminar. ");
        meaning.add("Local Education Cycle.");
        meaning.add("Learning network");
        meaning.add("Learning Week.");
        meaning.add("Member Committee Executive Board.");
        meaning.add("Member Committee President.");
        meaning.add("Member Committee Vice President.");
        meaning.add("Type of internship - Management internship");
        meaning.add("Status for company or student in Insight XP. They found suitable match and now are in process of preparing everything for intern's arrival.");
        meaning.add("Organizing Committee");
        meaning.add("Organizing Committee President");
        meaning.add("Outgoing Preparation Seminar. ");
        meaning.add("President of AIESEC International.");
        meaning.add("Project Based on Exchange.");
        meaning.add("Status for company or student in Insight XP. Intern already arrived to country for internship and is doing his job in company.");
        meaning.add("Dance");
        meaning.add("Regional Support Team. ");
        meaning.add("Student Nominee.");
        meaning.add("Spanish Speaking Growth Network.");
        meaning.add("Traineeship Nominee");
        meaning.add("Co-operation between two LCs from different countries. Normally both LCs visit each other, have a seminar and create and work on strategies of cooperation.");
        meaning.add("Type of traineeship - Technical Traineeship.");
        meaning.add("Name for intern in receiving country.");
        meaning.add("The same meaning as international internship. ");
        meaning.add("Westem Europe and Northern America Growth Network. ");
        meaning.add("Youth to Business. Leadership Seminar. ");







        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             //   int posi= (int) listView.getItemAtPosition(position);
                String a= meaning.get(position);
                Log.d("TAG",a);
                Toast.makeText(MainActivity.this,a,Toast.LENGTH_LONG);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        MenuItem searchitem=menu.findItem(R.id.item_search);
        SearchView searchview=(SearchView) MenuItemCompat.getActionView(searchitem);
        searchview.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
               ArrayList<String> templist=new ArrayList<>();
                for (String temp: items){
                    if(temp.toLowerCase().contains(newText.toLowerCase())){
                        templist.add(temp);

                    }
                }
                ArrayAdapter<String> adapter=new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,templist);
                listView.setAdapter(adapter);
                return true;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}
