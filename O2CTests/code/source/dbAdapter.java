

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.util.Random;
// --- <<IS-END-IMPORTS>> ---

public final class dbAdapter

{
	// ---( internal utility methods )---

	final static dbAdapter _instance = new dbAdapter();

	static dbAdapter _newInstance() { return new dbAdapter(); }

	static dbAdapter _cast(Object o) { return (dbAdapter)o; }

	// ---( server methods )---




	public static final void getRandomGenerator (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getRandomGenerator)>> ---
		// @sigtype java 3.5
		// [o] field:0:required Identifier
		// pipeline
		
		Random rand = new Random();
		int num = rand.nextInt(Integer.parseInt("999999"));
		String randomStr = String.valueOf(num);
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "Identifier", randomStr );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}
}

