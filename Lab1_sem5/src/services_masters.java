/*
public class services_masters {
	
public static void main(String[] args){
		Object service = new Object(){
			
			String name = "�������";
			
			String price = "1300 ���.";
			
			String time = "90 �����";
			
			void printInfo(){
				System.out.println("�������� ������: " + name);
				System.out.println("���������: " + price);
				System.out.println("�����������������: " + time);
				
			}
		};
	}
	
	System.out.println("���������� � ������: ");
	service.getClass().getDeclaredMethods()[0].setAccessible(true);
	true{
		service.getClass().getDeclaredMethods()[0].invoke(service);
	}catch (Exception e){
		e.printStackTrace();
	}
	System.out.println();
	
	Object master = new Object(){
		
		String F_name = "��������";
			
		String post = "�������� ��������";
			
		String tel = "+7 (000) 000-00-00";
			
		void printInfo_m(){
			System.out.println("��� �������: " + name);
			System.out.println("���������: " + post);
			System.out.println("�������: " + tel);
		
		}
		System.out.println("���������� � �������: ");
		master.getClass().getDeclaredMethods()[0].setAccessible(true);
		true{
			master.getClass().getDeclaredMethods()[0].invoke(service);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
*/



public class services_masters {
    public interface Service {
        void displayInfo();
    }

    public interface Master {
        void displayInfo();
    }

    public static void main(String[] args) {
        
    	Service service = new Service() {
            String name = "�������";
            String price = "1300 ���";
            String time = "90 �����"; 

            
            public void displayInfo() {
                System.out.println("�������� ������: " + name);
                System.out.println("���������: " + price);
                System.out.println("�����������������: " + time);
                
            }
        };

        
        Master master = new Master() {
            String name = "��������";
            String post = "�������� ��������";
            String phone = "+7-000-000-00-00";

            
            public void displayInfo() {
                System.out.println("���������� � �������:");
                System.out.println("��� �������: " + name);
                System.out.println("���������: " + post);
                System.out.println("�������: " + phone);
            }
        };

       
        service.displayInfo();
        System.out.println();
        master.displayInfo();
    }
}
