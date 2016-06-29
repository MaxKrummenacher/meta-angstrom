# Image with a XFCE desktop and various development tools installed

require development-image.bb

EXTRA_IMAGE_FEATURES += "splash"

IMAGE_INSTALL += " \
	packagegroup-gnome \
	packagegroup-gnome-apps \
	packagegroup-gnome-themes \
	packagegroup-gnome-xserver-base \
	packagegroup-core-x11-xserver \
	packagegroup-gnome-fonts \
	\
	connman-gnome \
"

export IMAGE_BASENAME = "development-GNOME-image"
