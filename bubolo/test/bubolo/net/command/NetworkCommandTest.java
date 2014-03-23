/**
 * Copyright (c) 2014 BU MET CS673 Game Engineering Team
 *
 * See the file license.txt for copying permission.
 */

package bubolo.net.command;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import bubolo.graphics.LibGdxAppTester;
import bubolo.net.Network;
import bubolo.net.NetworkCommand;
import bubolo.net.NetworkSystem;
import bubolo.test.MockWorld;
import bubolo.world.World;
import bubolo.world.entity.Entity;
import bubolo.world.entity.concrete.Grass;
import bubolo.world.entity.concrete.Tank;

/**
 * @author BU CS673 - Clone Productions
 */
public class NetworkCommandTest
{
	@BeforeClass
	public static void setupClass()
	{
		LibGdxAppTester.createApp();
	}

	@Test
	public void testCreateEntityCommand()
	{
		NetworkCommand c = new CreateEntity(Grass.class, UUID.randomUUID(), 0, 0, 0);
		c.execute(new MockWorld());
	}
	
	@Test
	public void testCreateTankCommand()
	{
		NetworkCommand c = new CreateTank(mock(Tank.class));
		c.execute(mock(World.class));
	}
	
	@Test
	public void testMoveEntity()
	{
		NetworkCommand c = new MoveEntity(mock(Entity.class));
		c.execute(mock(World.class));
	}

}
