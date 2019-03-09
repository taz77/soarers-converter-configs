##############################################
#### IBM Model M for Mac configuration.   ####
##############################################

# Start the remaping block.
remapblock 
# Default layer of configurations.
layer 0  
	CAPS_LOCK 	FN1				# The all important function key.
	# Left Alt into Commmand.
	LALT		LGUI
	# Right Alt into Command.
	RALT		RGUI
	# Make the right Control into Right Alt which functions as the option key for Mac.
	RCTRL		RALT
	# Use the Pause/break key for the power function.
	PAUSE		SYSTEM_POWER	# Top right corner power key

	# On a Mac the F14 key press is the key used to decrease screen brightness.
	F1			F14
	# F15 increases brightness.
	F2			F15

	# Self explanitory media controls. Works for Spotify and other players.
	F7			MEDIA_PREV_TRACK
	F8			MEDIA_PLAY_PAUSE
	F9			MEDIA_NEXT_TRACK
	F10			MEDIA_MUTE
	F11			MEDIA_VOLUME_DOWN
	F12			MEDIA_VOLUME_UP
endblock

# Create some Macros for key combinations used often.
macroblock
	# Use Print Screen button to initiate a screen capture by selection.
	macro PRINTSCREEN
		# Presses Left Shift and holds it.
		PUSH_META SET_META LSHIFT
		# Presses Command and holds it.
		PUSH_META SET_META LGUI
		# Presses the number 4.
		PRESS 4
		# Clear all holds and presses.
		POP_ALL_META
	endmacro
endblock
