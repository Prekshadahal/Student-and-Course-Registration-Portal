
/**
 * Write a description of class Non_Academic_Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Non_Academic_Course extends Course
{
    public String Instructor_Name;
    public int Duration;
    public String Start_Date;
    public String Completion_Date;
    public String Exam_Date;
    public String Prerequisite;
    public boolean is_Registered;
    public boolean is_Removed;
    
    //Constructor of Non_Academic_Course
    Non_Academic_Course (String CourseID, String CourseName, int CourseDuration, String prerequisite)
    {
        super(CourseID, CourseName, CourseDuration);
        this.Prerequisite = prerequisite;
        this.Start_Date = " ";
        this.Completion_Date = " ";
        this.Exam_Date =" ";
        this.is_Registered = false;
        this.is_Removed = false;
        this.Instructor_Name = " ";
    }
    
    //Accesor Method for each attribute.
    public String getInstrutor_Name()
    {
        return this.Instructor_Name;
    }
    
    public int getDuration()
    {
        return this.Duration;
    }
    
    public String getStart_Date()
    {
        return this.Start_Date;
    }
    
    public String getCompletion_Date()
    {
        return this.Completion_Date;
    }
    
    public String getExam_Date()
    {
        return this.Exam_Date;
    }
    
    public String getPrerequisite()
    {
        return this.Prerequisite;
    }
    
    public boolean getis_Registered()
    {
        return this.is_Registered;
    }
    
    public boolean getis_Removed()
    {
        return this.is_Removed;
    }
    
    //Setters Method for Instructor_Name
    public void setInstructor_Name(String InstructorName)
    {
        if (is_Registered == false)
        {
            Instructor_Name = InstructorName;
        }
        
        else
        {
            System.out.println("Non Academic Course has already been registered. Thus, it is not possible to change the instructor name.");
        }
    }
    
    //Registering Method
    public void Register (String CourseLeader, String InstructorName, String StartDate, String CompletionDate, String ExamDate)
    {
        if (is_Registered == false)
        {
            setInstructor_Name(InstructorName);
            this.Start_Date = StartDate ;
            this.Completion_Date = CompletionDate;
            this.Exam_Date = ExamDate;
            this.is_Registered = true ;
        }
    
        else
        {
            System.out.println("The Non Academic Course has already been registered.");
        }
    }
    
    //Remove Method for Non_Academic_Course.
    public void Remove ()
    {
        if (is_Removed == true)
        {
            System.out.println("The Non Academic Course has already been removed.");
        }
        
        else
        {
            super.setCourse_Leader(Course_Leader);
            this.Instructor_Name =" ";
            this.Start_Date=" ";
            this.Completion_Date=" ";
            this.Exam_Date=" ";
            is_Registered = false;
            is_Removed = true; 
        }
    }
    
    //Method to Display Non Academic Course.
    public void Display()
    {
        super.Display();
        if (is_Registered == false)
        {
            System.out.println("The Course-ID is " +getCourse_ID());
            System.out.println("The Course name is " +getCourse_Name());
            System.out.println("The Duration of Course is " +getCourse_Duration());
        }
        
        else
        {
             System.out.println("The Instructor Name is " +getInstrutor_Name());
             System.out.println("The Starting Date is " +getStart_Date());
             System.out.println("The Completion Date is " +getCompletion_Date());
             System.out.println("The Exam Date is " +getExam_Date());
        }
    }
}