package modules.helloWorld.NewDocument.actions;

import org.skyve.metadata.controller.ServerSideAction;
import org.skyve.metadata.controller.ServerSideActionResult;
import org.skyve.web.WebContext;

import modules.helloWorld.domain.NewDocument;

public class EchoText implements ServerSideAction<NewDocument> {

	@Override
	public ServerSideActionResult<NewDocument> execute(NewDocument bean, WebContext webContext) throws Exception {

		bean.setEchoedText(bean.getTextToEcho());
		return new ServerSideActionResult<NewDocument>(bean);
	}

}
