# GlowingPlugin
Minecraft 1.21. (Paper Server) Glowing Plugin

⸻

🌟 Permanent Glowing Plugin (Paper / Bukkit)

📌 Overview

This plugin gives all players on the server a permanent Glowing effect, making it easy to see friends through walls and terrain.

It is designed for co-op, survival and fun servers, where players want better orientation and visibility of each other — not primarily for PvP.

The effect automatically persists through:
	•	Death
	•	Respawn
	•	Totem of Undying
	•	World changes
	•	Server reloads

No commands, no configuration, no command blocks required.

⸻

✅ Compatibility
	•	Minecraft versions: 1.21+
	•	Tested up to: Paper 1.21.11
	•	Server software: Paper / Spigot compatible
	•	Java version: Java 21

The plugin uses only stable Bukkit/Paper API features and does not rely on NMS or reflection, making it future-proof within the 1.21.x versions.

⸻

🎯 Purpose & Use Case

This plugin is intended for:
	•	Playing with friends in Survival or SMP worlds
	•	Easily locating teammates underground or in large areas
	•	Improving orientation and cooperation
	•	Casual and fun gameplay

It is not intended as a PvP advantage, but as a quality-of-life feature for group play.

⸻

⏱ Effect Duration (Important Note)

The Glowing effect is applied with a very long duration (internally several years of game time).

Because of this:
	•	The effect never expires during normal gameplay
	•	The inventory may show a very large remaining time
	•	This is expected behavior and does not affect gameplay or performance

The effect is automatically reapplied if it is ever removed.

⸻

🎨 Colored Glowing via Teams

Minecraft itself does not support colored Glowing effects directly.
However, Glowing colors are determined by scoreboard teams.

You can assign colors using vanilla Minecraft commands:

Create a team

/team add redTeam

Set a team color

/team modify redTeam color red

Add a player to a team

/team join redTeam PlayerName

Available colors
	•	red
	•	blue
	•	green
	•	yellow
	•	aqua
	•	gold
	•	purple
	•	white
	•	gray
	•	dark_red
	•	dark_blue
	•	dark_green
	•	dark_purple

Players will glow in the color of their team.

⸻

🚀 Features
	•	Permanent Glowing for all players
	•	Works across deaths and Totems of Undying
	•	No commands required
	•	No performance impact
	•	Event-based and lightweight
	•	Compatible with Paper 1.21+

⸻

📦 Installation
	1.	Download the .jar from the Releases section
	2.	Place it in your server’s /plugins folder
	3.	Restart the server

That’s it — players will glow automatically.

⸻

❤️ Final Notes

This plugin was created to enhance fun, cooperation and visibility when playing together.
If you enjoy playing Minecraft with friends and want a simple way to keep track of each other, this plugin is for you.
