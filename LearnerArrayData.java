public class LearnerArrayData{
//store all learner names
    private String[] learnernames=new String[26];

    public void assignLearnerNames(){
        //assign the learner names
    learnernames[0] = "Aadhil Ahamed Meeran"; 
    learnernames[1] = "Abhishek Tripathi"; 
    learnernames[2] = "Anjali Bharti"; 
    learnernames[3] = "Arthika L"; 
    learnernames[4] = "Arulmozhivarman SenthilKumar"; 
    learnernames[5] = "Charishma M"; 
    learnernames[6] = "Gagan Saraswat"; 
    learnernames[7] = "Gedela Swapna"; 
    learnernames[8] = "Hariharan S"; 
    learnernames[9] = "Ishant Bansal"; 
    learnernames[10] = "karnati surya Reddy"; 
    learnernames[11] = "Karthik T"; 
    learnernames[12] = "Kaviya H R"; 
    learnernames[13] = "Khyati Gondaliya"; 
    learnernames[14] = "Mohammed Maheen"; 
    learnernames[15] = "Mokshana M R"; 
    learnernames[16] = "Molabanti Amulya"; 
    learnernames[17] = "Priya P"; 
    learnernames[18] = "Saripudi Mavya"; 
    learnernames[19] = "Shanjeevi M"; 
    learnernames[20] = "Shilpa S"; 
    learnernames[21] = "Shiyam Raj J"; 
    learnernames[22] = "Soundarya K"; 
    learnernames[23] = "Suvham Patro"; 
    learnernames[24] = "Vishranthi A";

    }

    public void printLearnerNames(){
        System.out.println(learnernames);
//        for(int i=0; i<learnernames.length; i++){
//            System.out.println(learnernames[i]);
//      }

        for(String names : learnernames){
            System.out.println(names);
        }
    }
}