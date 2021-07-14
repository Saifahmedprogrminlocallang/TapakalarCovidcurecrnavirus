import java.io.*;
import java.util.*;
import java.lang.*;


public class CandidateCodePatientsResultsScrutinize {
   public static void main(String args[] ) throws Exception {

	String Virusunderscrutiny="coronavirus";

	  String InputLangKeywordFilename = "D:\\Saif\\LocallangProgram\\Test\\Inputtestfiletobescrutinizedforpatientresults.txt";

	      String strCurrentLinenew2 = "";
	      String keyword2=""; 
		  String keywordstartpattern2 = "-";
		  
		  int keywordhyphenstartpattern2 =0;
		  
		  int counter2 =0;
		  
	      Hashtable<Integer,String> ht2=new Hashtable<Integer,String>();  
	      Hashtable<Integer,String> hm2=new Hashtable<Integer,String>();  
	      int zkj;
	      zkj=0;
		  
	      try {

			  BufferedReader br_inputlanglkfile = new BufferedReader(new FileReader(InputLangKeywordFilename ));
					  
			    while ((strCurrentLinenew2=br_inputlanglkfile.readLine()) != null) {

				if (zkj<=2) {
			        System.out.println("strCurrentLinenew2 " + strCurrentLinenew2);
			    	
			        keywordhyphenstartpattern2 = strCurrentLinenew2.indexOf(keywordstartpattern2)	;
			    	if (keywordhyphenstartpattern2>0) {
			        keyword2 = strCurrentLinenew2.substring(keywordhyphenstartpattern2);
			    	keyword2 = keyword2.substring(2, keyword2.length());
			    	keyword2 = keyword2.trim();
			    	ht2.put(counter2, ""+keyword2);
				hm2.put(counter2, ""+counter2);
			    	System.out.println("keyword2 - " +keyword2);

			    	counter2 = counter2 + 1;
				}
				zkj=zkj+1;
			    	}
			    }
			    br_inputlanglkfile.close();
			   } catch (IOException ZKTDTKiznkioe) {
				ZKTDTKiznkioe.getStackTrace();   
			   } catch (Exception e) {
				e.getStackTrace();   
			   } 		


String BloodCompositionofpatients[]=new String[10];

int zijk;
zijk=0;
int numberofpatients;
numberofpatients=0;


String args1[]={"1","2","3"};
String args2[]={"abcde","crnas","onarous"};




/**
		    Set yourSet = hm2.keySet(); // hm 
		    							// it 
		    							// hmt
		    							// mSet
		    Iterator it1 = yourSet.iterator();
		    
		    //Set replaceSet = ht1.keySet(); 
		    Set replaceSet = ht2.keySet(); 
		    // hm 
			// it 
			// hmt
		    // pSet, tSet
		    Iterator it2 = replaceSet.iterator();


		    String kString ="";
		    String jString ="";

int testfoobarijkltestfoobar;
testfoobarijkltestfoobar=0;

		    while(it2.hasNext())
		    {
		      Object k = it1.next();
		      Object v = hm2.get(k);
		      System.out.println(k + " : " + v);
		      args1[testfoobarijkltestfoobar] =  v.toString();
		      kString = args1[testfoobarijkltestfoobar];
		      System.out.println("kString -"+kString);


		      Object j = it2.next();
		      Object p = ht2.get(j); //ht1.get(j);
		      System.out.println(j + " : " + p);

		      args2[testfoobarijkltestfoobar] =  p.toString();
		      jString = args2[testfoobarijkltestfoobar];
		      System.out.println("jString -"+jString);


testfoobarijkltestfoobar=testfoobarijkltestfoobar+1;
		     }  
**/	    		  

Virusunderscrutiny=args1[0];
int nzpatientnumber=0;

String nzpatientnumberstring="";

try {
nzpatientnumberstring = args2[1];
nzpatientnumber= Integer.parseInt(nzpatientnumberstring);
} catch(NumberFormatException ZKTDTKNFEbNFEiznkioe) {
ZKTDTKNFEbNFEiznkioe.getStackTrace();
} catch (Exception e) {
e.getStackTrace();
}

int i;
i=0;

String BloodSequenceofpatients[]=new String[3];

//get the order of bit endian of the blood infected by virus and blood sequence
while (i<=2) {

BloodSequenceofpatients[i] = args2[i];
i++;
}

int patientBloodsequencelength=0;
int klm=0;

for (klm=0;klm<nzpatientnumber;klm++) {

patientBloodsequencelength = BloodSequenceofpatients[i].length();
int BloodSequenceFlagSetPresent[]= new int[patientBloodsequencelength];

String PatientBloodSequenceofPatienttobeinvestigatedSequence=BloodSequenceofpatients[klm];
int z=0;

int knz;
knz=PatientBloodSequenceofPatienttobeinvestigatedSequence.length();

int PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequence[] = new int[knz];

int zkn=0;

int PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencebool=0;
int Stringindexofbloodcompositionsequencestringinviruscompositionstring=0;

for(zkn=0;zkn<knz;zkn++) {
z=0;

String PatientBloodSequenceofPatienttobestringtobesearched = "";
PatientBloodSequenceofPatienttobestringtobesearched = Character.toString(PatientBloodSequenceofPatienttobeinvestigatedSequence.charAt(z));

Stringindexofbloodcompositionsequencestringinviruscompositionstring = Virusunderscrutiny.indexOf(PatientBloodSequenceofPatienttobestringtobesearched);
/**if (PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequence[zkn] ==  /**((ht2.get(zkn)).indexOf(Stringindexofbloodcompositionsequencestringinviruscompositionstring))){ **/

if (PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequence[zkn] ==  Stringindexofbloodcompositionsequencestringinviruscompositionstring){
z++;
}
else {
System.out.println("sequence not matched");
}
}
int nkz=0;


for(nkz=0;nkz<zkn;nkz++) {
   if (PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequence[nkz]<PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequence[nkz+1]){
   //set ascending order flag  PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencebool=0;
   PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencebool=0;     
   } else {
   PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencebool=1;     
}
}

int lycydsknjgtrck=nzpatientnumber;

int PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequenceFlagSetResult[]= new int[lycydsknjgtrck];
int ijknz=0;

while (ijknz<nzpatientnumber){
if (PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequencebool==0) {
PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequenceFlagSetResult[ijknz]= 0;
} else {
PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequenceFlagSetResult[ijknz]= 1;
}

if(PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequenceFlagSetResult[ijknz]==0) {
   System.out.println("Result - "+PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequenceFlagSetResult[ijknz]+" - success ...- not corona positive");
} else {
   System.out.println("Result - "+PatientBloodSequenceofPatienttobeinvestigatedSetFlagfortheSequenceFlagSetResult[ijknz]+" - failure ...- corona positive");
}

ijknz=ijknz+1;
}


}

    }
}

