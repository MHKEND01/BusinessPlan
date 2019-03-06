/**
 * 
 */
package BusinessPlan.BusinessPlan;

/**
 * @author lee.kendall
 *
 */
public class PlanFile {

	private String year;
	private Department department;
	private boolean canEdit;
	private Plan plan;
	
	/**
	 * @param year
	 * @param department
	 * @param canEdit
	 * @param plan
	 */
	public PlanFile(String year, Department department, boolean canEdit, Plan plan) 
	{
		this.year = year;
		this.department = department;
		this.canEdit = canEdit;
		this.plan = plan;
	}

}
