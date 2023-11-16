package bondhon.management.system;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private int id;
    private String email;
    private String password;
    private String name="";
    private String fatherName;
    private String motherName;
    private String birthday;
    private String gender;
    private int age;
    private String mobileNumber;

    public User() {
        // Default constructor
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id; 
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        this.email = email.toUpperCase();
        return isValidEmail(email);
    }

    public String getPassword() {
        return password;
    }

    public boolean setPassword(String password) {
        this.password = password;
        return isValidPassword(password);
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name1) {
        this.name = name1.toUpperCase();
         if(name1.length()<3){              
            return false;
        }
       return true;
    }

    public String getFatherName() {
        return fatherName;
    }

    public boolean setFatherName(String fatherName) {
        this.fatherName = fatherName.toUpperCase();
        if(fatherName.length()<3){              
            return false;
        }
        return true;
    }

    public String getMotherName(){
        return motherName;
    }

    public boolean setMotherName(String motherName) {
        this.motherName = motherName.toUpperCase();
         if(motherName.length()<3){            
            return false;
        }
        return true;
    }

    public String getBirthday() {
        return birthday;
    }

    public boolean setBirthday(String birthday) {
        this.birthday = birthday;
        calculateAge();
        if(age<=0||age>=150)
        {
            return false;
        }           
            return true;
    }

    public String getGender() {
        return gender;
        
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public boolean setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        if(mobileNumber.length()<11||mobileNumber.length()>14)
        {
            return false;
        }
        return true;
    }

    // Calculate age based on the provided birthday (dd/mm/yyyy)
    public void calculateAge() {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date birthDate = dateFormat.parse(birthday);
            Date currentDate = new Date();
            long diffInMilliseconds = currentDate.getTime() - birthDate.getTime();
            long diffInYears = diffInMilliseconds / (1000L * 60 * 60 * 24 * 365);
            age = (int) diffInYears;
        } catch (ParseException e) {
            System.err.println("Error parsing birthday: " + e.getMessage());
        }
    }
    
    
     public static boolean isValidEmail(String email) {
        // Regular expression pattern for a simple email validation
        if(email.length()<8){
            return false;
        }
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the email against the pattern
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
      public static boolean isValidPassword(String password) {
        // Regular expression pattern for password validation
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";//"^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).{8,}$";


        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the password against the pattern
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }


    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
    
    public static void main(String args[]) {
       
        User user=new User();
        
        user.setBirthday("28/04/2030");
        user.calculateAge();
        System.out.println(user.getAge());
        String em="Raiiiiiiii";
        if(isValidPassword(em))
        {
             System.out.println("yes");
        }else{
             System.out.println("no");
        }
                
        
    } 
    
}
