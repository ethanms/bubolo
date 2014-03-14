package bubolo.audio;

import java.io.File;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.files.FileHandle;

/**
 * A tank hit sound effect.
 * 
 * @author BU673 - Clone Industries
 */
public class TankHit extends SoundEffect
{
	/**
	 * Constructs a tank hit sound effect. External systems should not 
	 * construct <code>SoundEffect</code>s directly.
	 */
	TankHit()
	{
		FileHandle soundFile = new FileHandle(new File(Audio.SFX_PATH + "tankhit.ogg"));
		Sound sound = Gdx.audio.newSound(soundFile);
		setSound(sound);
	}
}
