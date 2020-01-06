package Manager;
import java.io.Serializable;



	@SuppressWarnings("serial")
	public class Manager implements Serializable {

		/** The manager id. */
		private int managerId;
		
		/** The fname. */
		private String fname;
		
		/** The lname. */
		private String lname;


		/**
		 * Instantiates a new manager.
		 *
		 * @param managerId the manager id
		 * @param name the name
		 * @param lname the lname
		 */
		public Manager(int managerId, String name,String lname) {
			super();
			this.managerId = managerId;


		}



		/**
		 * Gets the manager id.
		 *
		 * @return the manager id
		 */
		public int getManagerId() {
			return managerId;
		}




		/**
		 * Sets the manager id.
		 *
		 * @param managerId the new manager id
		 */
		public void setManagerId(int managerId) {
			if(managerId>0)
			this.managerId = managerId;
		}




		/**
		 * Gets the f name.
		 *
		 * @return the f name
		 */
		public String getfName() {
			return fname;
		}




		/**
		 * Sets the f name.
		 *
		 * @param fname the new f name
		 */
		public void setfName(String fname) {
			if (fname.matches("[A-Z][a-z\\s]+")&& fname.length() > 2)
					this.fname = fname;
		}

		/**
		 * Gets the l name.
		 *
		 * @return the l name
		 */
		public String getlName() {
			return lname;
		}




		/**
		 * Sets the l name.
		 *
		 * @param lname the new l name
		 */
		public void setlName(String lname) {
			if (fname.matches("[A-Z][a-z\\s]+") && fname.length() > 2)
					this.lname = fname;
		}



		/**
		 * To string.
		 *
		 * @return the string
		 */
		@Override
		public String toString() {
			return getClass().getName()+ " managerId : " + managerId + ", name: " + fname +" " + lname +"]";
		}







	}