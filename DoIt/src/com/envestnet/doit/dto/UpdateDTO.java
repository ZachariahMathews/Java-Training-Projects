package com.envestnet.doit.dto;

import com.envestnet.doit.beans.Task;
import com.envestnet.doit.dao.beans.TaskBean;

public interface UpdateDTO {

	TaskBean convertTO(Task task);

}
