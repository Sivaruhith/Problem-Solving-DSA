class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        
        int start1 = timeToMinutes(event1[0]);
        int end1 = timeToMinutes(event1[1]);
        
        int start2 = timeToMinutes(event2[0]);
        int end2 = timeToMinutes(event2[1]);
        
        return !(end1 < start2 || end2 < start1);
    }

    public int timeToMinutes(String time) {
        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3, 5));
        
        return hour * 60 + minute;
    }
}