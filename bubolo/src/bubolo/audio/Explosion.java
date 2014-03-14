package bubolo.audio;

import java.io.File;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.files.FileHandle;


/**
 * An explosion sound effect.
 * 
 * @author BU673 - Clone Industries
 */
public class Explosion extends SoundEffect
{
	/**
	 * Constructs an explosion sound effect. External systems should not 
	 * construct <code>SoundEffect</code>s directly.
	 */
	Explosion()
	{
		FileHandle soundFile = new FileHandle(new File(Audio.SFX_PATH + "explosion.ogg"));
		Sound sound = Gdx.audio.newSound(soundFile);
		setSound(sound);
	}
}
