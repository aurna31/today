package cont;


import model.student;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "abc")
public class cntClass extends student {
    student student=new student();

    public cntClass() {
    }

    public model.student getStudent() {
        return student;
    }

    public void setStudent(model.student student) {
        this.student = student;
    }

}
