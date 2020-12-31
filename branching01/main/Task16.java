package by.htp.branching01.main;

/* На плоскости ХОY задана своими координатами точка А. Указать,
 * где она расположена (на какой оси или в каком координатном угле)
 */

public class Task16 {
	
    public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		if((x > 0 | x < 0) & y == 0) {
			
			System.out.println("точка А принадлежит оси x ");
			
		}else if(x == 0 & (y > 0 | y < 0)) {
			
			System.out.println("точка А принадлежит оси y ");
			
		}else if(x > 0 & y > 0) {
			
			System.out.println("точка А принадлежит первому координатному углу ");
			
		}else if(x < 0 & y > 0) {
			
			System.out.println("точка А принадлежит второму координатному углу ");
			
		}else if(x < 0 & y < 0) {
			
			System.out.println("точка А принадлежит третему координатному углу ");			
			
		}else if(x > 0 & y < 0) {
			
			System.out.println("точка А принадлежит четвертому координатному углу ");			
			
		}
			
	}

}
