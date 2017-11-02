package model;

public class NaviDrawItem {

	private String title;
	private String count="0";
	private int icon;
	private boolean isVisible=false;
	public NaviDrawItem()
	{}
	public NaviDrawItem(String title,int icon)
	{
		this.title=title;
		this.icon=icon;
	}
	public NaviDrawItem(String title,int icon,boolean isVisible,String count)
	{
		this.title=title;
		this.count=count;
		this.icon=icon;
		this.isVisible=isVisible;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public int getIcon() {
		return icon;
	}
	public void setIcon(int icon) {
		this.icon = icon;
	}
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	
}
