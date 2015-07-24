package trainres.dao;

import trainres.beans.JourneyBean;
import trainres.beans.PassengerBean;

public interface CheckAvailDAO {

	public boolean update(PassengerBean pb,JourneyBean jb);
}
