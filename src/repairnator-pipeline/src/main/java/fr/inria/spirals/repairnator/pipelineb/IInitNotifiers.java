package fr.inria.spirals.repairnator.pipelineb;

import fr.inria.spirals.repairnator.notifier.AbstractNotifier;
import fr.inria.spirals.repairnator.notifier.PatchNotifier;

import java.util.List;

public interface IInitNotifiers {

	void initNotifiers();

	List<AbstractNotifier> getNotifiers();

    PatchNotifier getPatchNotifers();

}