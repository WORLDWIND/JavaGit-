package OOPDay03.ClassExercises;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/23  14:56
 **/
public class TeduManagementSystem {
    /**设计达内基本教学人员的分工*/
    public static void main(String[] args) {
        directorOfTeachingAndResearch directorOfTeachingAndResearch = new directorOfTeachingAndResearch("李雨航",22,200000.3,"教研总监");
        Lecturers lecturers = new Lecturers("小美",22,10000.3,"讲师");
        projectManager projectManager = new projectManager("酒哥",30,20000,"项目经理");
        classTeachers classTeachers = new classTeachers("娜姐",25,15000,"班主任");
        //教研总监
        directorOfTeachingAndResearch.clockIn();
        directorOfTeachingAndResearch.clockOut();
        directorOfTeachingAndResearch.finishWork();
        directorOfTeachingAndResearch.solveProblem();
        directorOfTeachingAndResearch.trainEmplayees();
        directorOfTeachingAndResearch.editorialSecretary();
        System.out.println(directorOfTeachingAndResearch);
        //讲师
        lecturers.clockIn();
        lecturers.clockOut();
        lecturers.finishWork();
        lecturers.solveProblem();
        lecturers.trainEmplayees();
        lecturers.editorialSecretary();
        System.out.println(lecturers);
        //项目经理
        projectManager.clockIn();
        projectManager.clockOut();
        projectManager.finishWork();
        projectManager.editorialSecretary();
        System.out.println(projectManager);
        //班主任
        classTeachers.clockIn();
        classTeachers.clockOut();
        classTeachers.finishWork();
        System.out.println(classTeachers);
    }
}

class CompanyPersonnel {
    String name;//姓名
    int age;//年龄
    double salary;//工资
    String status;//身份
    CompanyPersonnel(){

    }
    CompanyPersonnel(String name,int age,double salary,String status){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.status = status;
    }
    public void clockIn() {
        System.out.println(name + status + "上班打卡");
    }

    public void clockOut() {
        System.out.println(name + status + "下半打卡");
    }
    public void finishWork(){
        System.out.println(name + status + "完成了工作");
    }
    public String toString(){
        return name + status + ",工资是:" + salary + ",年龄是:" + age;
    }
}
//解决企业问题
interface solveProblem{
    void solveProblem();
}
//培训员工
interface trainEmployees{
    void trainEmplayees();
}
//编辑书籍
interface editorialSecretary{
    void editorialSecretary();
}
//教研总监
class directorOfTeachingAndResearch extends CompanyPersonnel implements solveProblem,trainEmployees,editorialSecretary{
    directorOfTeachingAndResearch(String name,int age,double salary,String status){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.status = status;
    }
    @Override
    public void solveProblem() {
        System.out.println(name + status + "解决的问题");
    }

    @Override
    public void trainEmplayees() {
        System.out.println(name + status + "培训员工");
    }

    @Override
    public void editorialSecretary() {
        System.out.println(name + status + "编辑书籍");
    }
}
//讲师
class Lecturers extends CompanyPersonnel implements solveProblem,trainEmployees,editorialSecretary{
    Lecturers(String name,int age,double salary,String status){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.status = status;
    }
    @Override
    public void solveProblem() {
        System.out.println(name + status + "培训员工");
    }

    @Override
    public void trainEmplayees() {
        System.out.println(name + status + "解决了问题");
    }

    @Override
    public void editorialSecretary() {
        System.out.println(name + status + "编辑书籍");
    }
}
//项目经理
class projectManager extends CompanyPersonnel implements editorialSecretary{
    projectManager(String name,int age,double salary,String status){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.status = status;
    }
    @Override
    public void editorialSecretary() {
        System.out.println(name + status + "编辑书籍");
    }
}
//班主任
class classTeachers extends CompanyPersonnel{
    classTeachers(String name,int age,double salary,String status){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.status = status;
    }

}