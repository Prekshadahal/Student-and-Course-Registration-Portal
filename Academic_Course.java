
/**
 * Write a description of class Academic_Course here.
 *
 * @author (your name)
 * @version (a version number or 
 */ 
 
public class Academic_Course extends Course
{
    // Attributes of class Academic Course
    
    public String Lecturer_Name;
    public String Level;
    public String Credit;
    public String Starting_Date;
    public String Completion_Date;
    public int No_Of_Assesments;
    public boolean is_Registered;
    
    /*
     *Constructor of Academic_Course class which has six parameters 
     */
    
    Academic_Course (String CourseID, String CourseName, int CourseDuration, String Level, String Credit,  int No_Of_Assesments)
    {
        super(CourseID,CourseName,CourseDuration);//super and parameter name is used to call the parent class
        this.Level = Level;
        this.Credit = Credit;
        this.No_Of_Assesments = No_Of_Assesments;
        this.Lecturer_Name =" ";
        this.Starting_Date = " ";
        this.Completion_Date =" ";
        this.is_Registered = false;
    }
    
    //Getters/Accesor Method for each attribute.
    public String getLecturer_Name()
    {
        return this.Lecturer_Name;
    }
    
    public String getLevel()
    {
        return this.Level;
    }
    
    public String getCredit()
    {
        return this.Credit;
    }
    
    public String getStarting_Date()
    {
        return this.Starting_Date;
    }
    
    public String getCompletion_Date()
    {
        return this.Completion_Date;
    }
    
    public int getNo_Of_Assesments()
    {
        return this.No_Of_Assesments;
    }
    
    public boolean getis_Registered()
    {
        return this.is_Registered;
    }
    
    //Setter/Mutator Method for Lecturer_Name-
    public void setLecturer_Name(String LecturerName)
    {
        Lecturer_Name = LecturerName;
    }
    
    //Setter Method for No_Of_Assesments
    public void setNo_Of_Assesments (int NoOfAssesments)
    {
        No_Of_Assesments = NoOfAssesments;
    }
    
    /*Method to register a Course
     * that accepts four parameters that include Course Leader name, Lecturer name, Starting Date,and Completion Date
     * if the Academic Course has been registered then then an appopriate message including the above three parameters should be displayed (Except for Cousrse Leader.),
     * if the Acaemic Course has not been registered then the method to set the course leader is called from the parent class with the course Leader name as parameter,
     * and the lecturer name, starting date, and completion date are required to update by the parameter values input to the method,
     * the registered status of the course is changed to true and course removed status is initialized to false.
     */
    
    public void is_Registered( String CourseLeader, String LecturerName, String StartingDate, String CompletionDate)
    {
        if(this.is_Registered ==true)
        {
            System.out.println("The lecturer Name is "+ getLecturer_Name());
            System.out.println("Starting Date of the Course: " + getStarting_Date());
            System.out.println("Completion Date of the Course: " +getCompletion_Date());
            System.out.println("The Course has already been Registered.");
        }
        
        else
        {
             super.setCourse_Leader(CourseLeader);
             this.Lecturer_Name = LecturerName;
             this.Starting_Date =StartingDate;
             this.Completion_Date= CompletionDate;
             this.is_Registered = true;
        }
    }
    
    //Methhod to Display
    public void display()
    {
        super.Display();
        if(is_Registered == true)
        {
             System.out.println("The Lecturer Name is "+ getLecturer_Name());
             System.out.println("Level is: " +getLevel());
             System.out.println("Credit is: " +getCredit());
             System.out.println("Starting Date is: " +getStarting_Date());
             System.out.println("Completion Date is: " +getCompletion_Date());
             System.out.println("Number of Assesment is " +getNo_Of_Assesments());
        }
    }
}

