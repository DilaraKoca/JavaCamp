package Concrete;
import Abstract.gamerCheckService;
import Abstract.gamerService;
import Entities.Gamer;
	public class gamerManager implements gamerService{
       gamerCheckService _gamerCheckService;	
	public gamerManager(gamerCheckService _gamerCheckService) {
		super();
		this._gamerCheckService = _gamerCheckService;
	}
	@Override
	public void add(Gamer gamer) {
		if(_gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Ho�geldin " + gamer.getFirstName() + ". Kimlik do�rulama i�lemin ba�ar�yla ger�ekle�ti.");
		}else {
			System.out.println("Sisteme kay�t olunamad�. Kimlik do�rulama ba�ar�s�z");
		}	
	}
	@Override
	public void delete(Gamer gamer) {
System.out.println(gamer.getFirstName()+gamer.getLastName()+ " Yine Bekleriz.");	
	}
	@Override
	public void update(Gamer gamer) {
		if(_gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Ho�geldin " + gamer.getFirstName() + ". Bilgilerini g�ncelledik.");
		}else {
			System.out.println("G�ncelleme i�lemi ba�ar�s�z!");
		}
		
	}

}
