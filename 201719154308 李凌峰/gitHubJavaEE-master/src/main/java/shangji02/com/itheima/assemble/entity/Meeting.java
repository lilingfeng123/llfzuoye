package shangji02.com.itheima.assemble.entity;

import shangji02.com.itheima.assemble.dao.MeetingDaoImpl;

import java.util.List;

public class Meeting {
    private String title;
    private List<Boss> list;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setList(List<Boss> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "title='" + title + '\'' +
                ", list=" + list +
                '}';
    }


}
