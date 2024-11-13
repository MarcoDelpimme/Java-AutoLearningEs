import java.util.Date;

public class Allocation {
  private int allocationId;
  private int roomId;
  private int userId;
  private Date startDate;
  private Date endDate;
  private String status;

  public Allocation(int allocationId, int roomId, int userId, Date startDate, Date endDate, String status) {
    this.allocationId = allocationId;
    this.roomId = roomId;
    this.userId = userId;
    this.startDate = startDate;
    this.endDate = endDate;
    this.status = status;
  }

  public int getAllocationId() {
    return allocationId;
  }

  public void setAllocationId(int allocationId) {
    this.allocationId = allocationId;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public int getRoomId() {
    return roomId;
  }

  public void setRoomId(int roomId) {
    this.roomId = roomId;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public static void createAllocation() {

  }

  public static void updateAllocationStatus() {

  }

}
