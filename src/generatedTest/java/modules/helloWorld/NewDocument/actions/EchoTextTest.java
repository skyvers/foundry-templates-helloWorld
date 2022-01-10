package modules.helloWorld.NewDocument.actions;

import modules.helloWorld.domain.NewDocument;
import org.skyve.util.DataBuilder;
import org.skyve.util.test.SkyveFixture.FixtureType;
import util.AbstractActionTest;

/**
 * Generated - local changes will be overwritten.
 * Extend {@link AbstractActionTest} to create your own tests for this action.
 */
public class EchoTextTest extends AbstractActionTest<NewDocument, EchoText> {

	@Override
	protected EchoText getAction() {
		return new EchoText();
	}

	@Override
	protected NewDocument getBean() throws Exception {
		return new DataBuilder()
			.fixture(FixtureType.crud)
			.build(NewDocument.MODULE_NAME, NewDocument.DOCUMENT_NAME);
	}
}