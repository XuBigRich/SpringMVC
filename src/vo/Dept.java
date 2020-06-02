package vo;

import java.util.HashSet;
import java.util.Set;

public class Dept implements java.io.Serializable {
    // Fields

    private Integer did;
    private String dname;
    private Integer manager;
    private String tel;
    private Integer master;


    // Constructors

    /** default constructor */
    public Dept() {
    }

    /** full constructor */
    public Dept(String dname, Integer manager, String tel, Integer master) {
        this.dname = dname;
        this.manager = manager;
        this.tel = tel;
        this.master = master;
    }

    // Property accessors

    public Integer getDid() {
        return this.did;
    }


    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return this.dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Integer getManager() {
        return this.manager;
    }

    public void setManager(Integer manager) {
        this.manager = manager;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getMaster() {
        return this.master;
    }

    public void setMaster(Integer master) {
        this.master = master;
    }

}
