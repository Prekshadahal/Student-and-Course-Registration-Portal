
/**
 * Write a description of class Course here.
 *
 * @author (your name)=
 * @version (a version number or a date)
 */
public class Course
{
    /* Four att4ibutes are defined;
     * where Course_ID and Course_Duration are represented as a set of numbers (integer).
     * while the other two i.e. Course_Name and Course_Leader are represnted as a string of text.  
    */
    public String Course_ID;
    public String Course_Name;
    public String Course_Leader;
    public int Course_Duration;   
    
     
    // A constructor is used to initialize the values of the above attributes.
    Course(String CourseID, String CourseName, int CourseDuration) 
    {
        this.Course_ID = CourseID;          
        this.Course_Name = CourseName;
        this.Course_Duration = CourseDuration;
        this. Course_Leader = " "; // CourseLeader is initialized with empty string ("")
    }
    
    //Assigning each attribute with its corresponding accessor method (getters method)
                /**
                 * Accesor method -------> Getters Method
                                  -------> which is used to get the initialized value.
                                  
                 * Rule for accessor or getters method
                                  -------> Method name i.e. get should be prefixed before the attribute/variable name.
                 */
                
    public String getCourse_ID()
    {
        return this.Course_ID;
    }
    
    public String getCourse_Name()
    {
        return this.Course_Name;
    }
    
    public int getCourse_Duration()
    {
        return this.Course_Duration;
    }
    
    public String getCourse_Leader()
    {
        return this.Course_Leader;
    }
    
    //Assigning Course_Leader to a new name by accepting the new name of CourseLeader as a parameter by setters method.
                        /**
                         * Mutator Method -------> Setter Method
                                          -------> is used to set the initialized value.
                      
                         *Rule for Setter or Mutator method
                                         -------> Method name i.e. set should be prefixed before the attribute name,
                                         -------> followed by (<identifier> new_parameter_name).
                      
                        */
    public void setCourse_Leader(String CourseLeader)
    {
        this.Course_Leader = CourseLeader;
    }

    //Display method for displaying output
    public void Display()
    {
        System.out.println("Course ID is " +getCourse_ID());
        System.out.println("The Course name is " +getCourse_Name());
        System.out.println("Course Duration is " +getCourse_Duration());
        
        if(this.Course_Leader != " ")
        {
            System.out.println("The Course leader for " + getCourse_Name() + "is "+ getCourse_Leader());
        }
        else
        {
            System.out.println("Empty Course Leader Value.");
        }
    }
}