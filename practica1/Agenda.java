package practica1;

import java.util.List;

public class Agenda {
		protected static int any;
		private List<Paginas> paginas;
		
		
		
		public Agenda(int any) {
			this.any=any;
		}
		public int getAny() {
			return any;
		}
		public void setAny(int any) {
			this.any = any;
		}
		public List<Paginas> getPaginas() {
			return paginas;
		}
		public void setPaginas(List<Paginas> paginas) {
			this.paginas = paginas;
		}
		
}
