package shangji02.com.itheima.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shangji02.com.itheima.assemble.entity.Meeting;
import shangji02.com.itheima.assemble.service.MeetingService;

public class Test {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext02.xml");
        MeetingService meetingService = (MeetingService) applicationContext.getBean("meetingService");
        Meeting meeting = (Meeting) applicationContext.getBean("meeting");
        meetingService.startMeeting();
        System.out.println(meeting);

    }


}
