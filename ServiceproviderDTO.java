package customer;

public class ServiceproviderDTO {

	    private int Id;
	    private String IFSC_code;
	    private String Bank_name;
		private String c_name;
		private int acc_no;
		private long end_date;
		private String KYC_status;
		
		public String getc_name()
		{
			return c_name;
	
		}
		public void setc_name(String c_name)
		{
			this.c_name=c_name;
		}
		public String getIFSC_code()
		{
			return IFSC_code;
	
		}
		public void setIFSC_code(String c_name)
		{
			this.IFSC_code=IFSC_code;
		}
	}


