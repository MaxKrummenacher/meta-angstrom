# Image with target SDK and various development tools installed

CONMANPKGS = "connman connman-client connman-angstrom-settings connman-plugin-loopback connman-plugin-ethernet connman-plugin-wifi"

require systemd-image.bb

ARCHTOOLS = ""
ARCHTOOLS_x86 = "dmidecode"

IMAGE_INSTALL += " \
	packagegroup-sdk-target \
	\
	xinput-calibrator \
	systemd-analyze \
	\
	bash \
        pciutils \
	usbutils \
	i2c-tools \
	parse-edid \
	memtester \
	alsa-utils \
	devmem2 \
	iw \
	bonnie++ \
	hdparm \
	iozone3 \
	iperf \
	lmbench \
	rt-tests \
	evtest \
	bc \
	fb-test \
	tcpdump \
	procps \
	util-linux \
	coreutils \
	ethtool \
	bridge-utils \
	wget \
	screen \
	minicom \
	rsync \
	vim vim-vimrc \
	${ARCHTOOLS} \
	\
	git \
	\
	e2fsprogs-mke2fs \
	dosfstools \
	parted \
	xfsprogs \
	btrfs-tools \
	\
	python-core python-modules \
"

export IMAGE_BASENAME = "development-image"
