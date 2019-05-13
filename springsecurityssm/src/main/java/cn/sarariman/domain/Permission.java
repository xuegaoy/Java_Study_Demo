package cn.sarariman.domain;

public class Permission {
    private Integer id; //int(10) NOT NULL,
    private String permName; //varchar(50) DEFAULT NULL,
    private String permTag; //varchar(50) DEFAULT NULL,

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermName() {
        return permName;
    }

    public void setPermName(String permName) {
        this.permName = permName;
    }

    public String getPermTag() {
        return permTag;
    }

    public void setPermTag(String permTag) {
        this.permTag = permTag;
    }
}
