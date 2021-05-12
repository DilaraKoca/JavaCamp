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
			System.out.println("Hoþgeldin " + gamer.getFirstName() + ". Kimlik doðrulama iþlemin baþarýyla gerçekleþti.");
		}else {
			System.out.println("Sisteme kayýt olunamadý. Kimlik doðrulama baþarýsýz");
		}	
	}
	@Override
	public void delete(Gamer gamer) {
System.out.println(gamer.getFirstName()+gamer.getLastName()+ " Yine Bekleriz.");	
	}
	@Override
	public void update(Gamer gamer) {
		if(_gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Hoþgeldin " + gamer.getFirstName() + ". Bilgilerini güncelledik.");
		}else {
			System.out.println("Güncelleme iþlemi baþarýsýz!");
		}
		
	}

}
