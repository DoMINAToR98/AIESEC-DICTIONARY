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
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> items;
    HashMap<String,String> meaning;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listview);
        items=new ArrayList<>();
        items.add("AIESEC");
        items.add("AC");
        items.add("AI");
        items.add("APGN");
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
        items.add("EB");
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
        meaning=new HashMap<String, String>();
        meaning.put("AIESEC","Association internationale des etudiants en sciences economiques et commerciales");
        meaning.put("AC","Assessment Centre - case studies and individual tasks for students while going through selection process for membership.");
        meaning.put("AI","AIESEC International");
        meaning.put("APGN","Asia Pacific Growth Network.");
        meaning.put("BOA","Board of Advisors.");
        meaning.put("BUDDY","A member who is the contact person responsible for the well-being of an intern during his or her stay in the country. ");
        meaning.put("CEED","Exchange of AIESEC members between two LCs. AIESEC members can work fora period of time in a LC abroad doing AIESEC work. Usually takes from a week to 6 months. ");
        meaning.put("CEE GN","Central and Eastern Europe Growth Network.");
        meaning.put("CDs","Career Days. ");
        meaning.put("CT","Challenging Time.");
        meaning.put("CVVV","Session Challengin World View.");
        meaning.put("CY","AIESEC code for Country");
        meaning.put("DELEGATE","Participant in a conference or seminar. Follows the complete agenda. ");
        meaning.put("DT","Type of internship - Development Internship ");
        meaning.put("DI","DELHI IIT ;)");
        meaning.put("EB","Executive Board");
        meaning.put("ELECT","Name for an executive board member from the time when he or she is elected and up to the time where they take over.");
        meaning.put("ET","Type of internship - Educational Internship. ");
        meaning.put("GCDP","Global Community Development Program.");
        meaning.put("GGN","Growth Network -AIESEC countries are divided into 5 growth networks (WENA, SS, CEE, Africa and AP).");
        meaning.put("GIP","Global Internship Program.");
        meaning.put("GN","Growth Network");
        meaning.put("GEP","Global Exchange Partner");
        meaning.put("IC","International Congress.");
        meaning.put("IG","Initiative group");
        meaning.put("ILP","Session Individual Learning Plan.");
        meaning.put("INKIND","Products provided for free as a sponsorship.");
        meaning.put("INS","Icelandic National Semina");
        meaning.put("IPM","International President Meeting");
        meaning.put("IXQPS","Exchange Quality Policies and Standards ");
        meaning.put("LC","Local Committee.");
        meaning.put("LCEB","Local Committee Executive Board. ");
        meaning.put("LCP","Local Committee President. Head of the local executive board. ");
        meaning.put("LCVP","Local Committee Vice President.");
        meaning.put("LDS","Leadership Development Seminar. ");
        meaning.put("LEC","Local Education Cycle.");
        meaning.put("LN","Learning network");
        meaning.put("LW","Learning Week.");
        meaning.put("MCEB","Member Committee Executive Board.");
        meaning.put("MCP","Member Committee President.");
        meaning.put("MCVP","Member Committee Vice President.");
        meaning.put("MT","Type of internship - Management internship");
        meaning.put("MATCHED","Status for company or student in Insight XP. They found suitable match and now are in process of preparing everything for intern's arrival.");
        meaning.put("OC","Organizing Committee");
        meaning.put("OCP","Organizing Committee President");
        meaning.put("OPS","Outgoing Preparation Seminar. ");
        meaning.put("PAI","President of AIESEC International.");
        meaning.put("P -BOX","Project Based on Exchange.");
        meaning.put("REALIZED","Status for company or student in Insight XP. Intern already arrived to country for internship and is doing his job in company.");
        meaning.put("ROLL CALL","Dance");
        meaning.put("RST","Regional Support Team. ");
        meaning.put("SN","Student Nominee.");
        meaning.put("SSGN","Spanish Speaking Growth Network.");
        meaning.put("TN","Traineeship Nominee");
        meaning.put("TWIN","Co-operation between two LCs from different countries. Normally both LCs visit each other, have a seminar and create and work on strategies of cooperation.");
        meaning.put("TT","Type of traineeship - Technical Traineeship.");
        meaning.put("TRAINEE","Name for intern in receiving country.");
        meaning.put("TRAINEESHIP","The same meaning as international internship. ");
        meaning.put("WENA GN","Westem Europe and Northern America Growth Network. ");
        meaning.put("Y2B","Youth to Business. Leadership Seminar. ");







        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             //   int posi= (int) listView.getItemAtPosition(position);
                String text=listView.getItemAtPosition(position).toString();
                String mean=meaning.get(text);
                Log.d("TAG",mean);
                Toast.makeText(MainActivity.this,""+mean,Toast.LENGTH_LONG).show();
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
