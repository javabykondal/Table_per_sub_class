package org.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "oldstudent")
@PrimaryKeyJoinColumn(name = "myold")
public class OldStudent extends Student {
    @Column(name = "OldId")

    private int oid;
    @Column(name = "Oname")
    private String oname;
    @Column(name = "OEmail")
    private String oemail;

    public OldStudent(int oid, String oname, String oemail) {
        this.oid = oid;
        this.oname = oname;
        this.oemail = oemail;
    }

    public OldStudent(String roll, String name, int oid, String oname, String oemail) {
        super(roll, name);
        this.oid = oid;
        this.oname = oname;
        this.oemail = oemail;
    }

    public OldStudent(int id, String roll, String name, int oid, String oname, String oemail) {
        super(id, roll, name);
        this.oid = oid;
        this.oname = oname;
        this.oemail = oemail;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public String getOemail() {
        return oemail;
    }

    public void setOemail(String oemail) {
        this.oemail = oemail;
    }

    @Override
    public String toString() {
        return "OldStudent{" +
                "oid=" + oid +
                ", oname='" + oname + '\'' +
                ", oemail='" + oemail + '\'' +
                '}';
    }
}
