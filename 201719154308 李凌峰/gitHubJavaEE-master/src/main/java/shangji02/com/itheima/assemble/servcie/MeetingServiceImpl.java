package shangji02.com.itheima.assemble.service;

import shangji02.com.itheima.assemble.dao.MeetingDao;

public class MeetingServiceImpl implements shangji02.com.itheima.assemble.service.MeetingService {
    private MeetingDao meetingDao;

    public void setMeetingDao(MeetingDao meetingDao) {
        this.meetingDao = meetingDao;
    }

    @Override
    public void startMeeting() {
        meetingDao.startMeeting();
        System.out.println("MeetingService调用了meetingDao");
    }
}
