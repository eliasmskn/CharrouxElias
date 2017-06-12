package gestionparc.domain;


public class GestionParc 
{
	int qte;
	Stock stock = new Stock();
	
	
//*******************************************Affichage QTE**********************************************************//	
	
	public int qteStockOrdi()
	{
		 qte = stock.getOrdinateurs().size();
		 return qte;
	}
	
	public int qteStockServ()
	{
		qte = stock.getServeurs().size();
		return qte;
	}
	
	public int qteStockTel()
	{
		qte = stock.getTelephones().size();
		return qte;
	}
	
//******************************************************************************************************************//
	
//*******************************************Ajout QTE**********************************************************//	
	
	public void ajoutStockOrdi(Ordinateur ordi)
	{
		 stock.getOrdinateurs().add(ordi);
	}
	
	public void ajoutStockServ(Serveur serv)
	{
		stock.getServeurs().add(serv);
	}
	
	public void ajoutStockTel(Telephone tel)
	{
		stock.getTelephones().add(tel);
	}
		
		
//******************************************************************************************************************//
	
//*******************************************Diminution QTE**********************************************************//	
	
		public void diminutionStockOrdi(Ordinateur ordi)
		{
			 stock.getOrdinateurs().remove(ordi);
		}
		
		public void diminutionStockServ(Serveur serv)
		{
			stock.getServeurs().remove(serv);
		}
		
		public void diminutionStockTel(Telephone tel)
		{
			stock.getTelephones().remove(tel);
		}
			
			
	//******************************************************************************************************************//
	

	
	
	
}
