package trainres.services.impl;

import trainres.beans.JourneyBean;
import trainres.beans.PassengerBean;
import trainres.dao.CheckAvailDAO;
import trainres.dao.impl.CheckAvailDAOImpl;
import trainres.services.CheckAvailService;

public class CheckAvailServiceImpl implements CheckAvailService {

	@Override
	public boolean update(PassengerBean pb,JourneyBean jb) {
		
		CheckAvailDAO pdao=new CheckAvailDAOImpl();
		return pdao.update(pb,jb);
	}

}
