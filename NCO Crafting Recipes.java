{
	{
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_monitor, 4), new Object[] {"PGP", "TFT", "PGP", 'P', "plateBasic", 'G', "dustGlowstone", 'T', "ingotTough", 'F', "steelFrame"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_power_port, 4), new Object[] {"PTP", "RFR", "PTP", 'P', "plateBasic", 'T', "ingotTough", 'R', "dustRedstone", 'F', "steelFrame"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_vent, 4), new Object[] {"PTP", "VFV", "PTP", 'P', "plateBasic", 'T', "ingotTough", 'V', "servo", 'F', "steelFrame"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_irradiator, 4), new Object[] {"PZP", "AFA", "PZP", 'P', "plateBasic", 'Z', "ingotZirconium", 'A', "ingotZircaloy", 'F', "steelFrame"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_source, 2, 0), new Object[] {"PRP", "BFB", "PRP", 'P', "plateBasic", 'R', "dustRadium", 'B', "dustBeryllium", 'F', "steelFrame"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_source, 2, 1), new Object[] {"PLP", "BFB", "PLP", 'P', "plateBasic", 'L', "dustPolonium", 'B', "dustBeryllium", 'F', "steelFrame"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_source, 2, 2), new Object[] {"PCP", "CFC", "PCP", 'P', "plateBasic", 'C', "ingotCalifornium252All", 'F', "steelFrame"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_shield, 4, 0), new Object[] {"PBP", "IFI", "PBP", 'P', "plateBasic", 'B', "ingotBoron", 'I', "ingotSilver", 'F', "steelFrame"});
		if (ModCheck.openComputersLoaded()) {
			addShapedOreRecipe(NCBlocks.fission_computer_port, new Object[] {"PMP", "CFC", "PBP", 'P', "plateBasic", 'M', RegistryHelper.itemStackFromRegistry("opencomputers:material:7"), 'C', RegistryHelper.blockStackFromRegistry("opencomputers:cable:0"), 'B', RegistryHelper.itemStackFromRegistry("opencomputers:material:4"), 'F', "steelFrame"});
		}
		
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_vessel_port, 4), new Object[] {"PSP", "ZFZ", "PSP", 'P', "plateElite", 'S', "servo", 'Z', "ingotZircaloy", 'F', "steelFrame"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port, 4, 0), new Object[] {"PSP", "TFT", "PSP", 'P', "plateElite", 'S', "servo", 'T', "ingotThermoconducting", 'F', "steelFrame"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port, 1, 1), new Object[] {" I ", "IPI", " I ", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'I', "ingotIron"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port, 1, 2), new Object[] {"RRR", "RPR", "RRR", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'R', "dustRedstone"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port, 1, 3), new Object[] {"QQQ", "QPQ", "QQQ", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'Q', "gemQuartz"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port, 1, 4), new Object[] {"DOD", "OPO", "DOD", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'O', "obsidian", 'D', "dustObsidian"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port, 1, 5), new Object[] {"INI", "NPN", "INI", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'N', Blocks.NETHER_BRICK, 'I', "ingotBrickNether"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port, 1, 6), new Object[] {"GGG", "GPG", "GGG", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'G', "dustGlowstone"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port, 1, 7), new Object[] {"LLL", "LPL", "LLL", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'L', "gemLapis"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port, 1, 8), new Object[] {" G ", "GPG", " G ", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'G', "ingotGold"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port, 1, 9), new Object[] {" R ", "RPR", " R ", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'R', "gemPrismarine"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port, 1, 10), new Object[] {"BBB", "BPB", "BBB", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'B', "slimeball"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port, 1, 11), new Object[] {"DED", "EPE", "DED", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'E', "endstone", 'D', "dustEndstone"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port, 1, 12), new Object[] {"CBC", "BPB", "CBC", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'B', Blocks.PURPUR_BLOCK, 'C', Items.CHORUS_FRUIT_POPPED});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port, 1, 13), new Object[] {" D ", "DPD", " D ", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'D', "gemDiamond"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port, 1, 14), new Object[] {" E ", "EPE", " E ", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'E', "gemEmerald"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port, 1, 15), new Object[] {" C ", "CPC", " C ", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'C', "ingotCopper"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port2, 1, 0), new Object[] {" T ", "TPT", " T ", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'T', "ingotTin"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port2, 1, 1), new Object[] {" L ", "LPL", " L ", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'L', "ingotLead"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port2, 1, 2), new Object[] {" B ", "BPB", " B ", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'B', "ingotBoron"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port2, 1, 3), new Object[] {" L ", "LPL", " L ", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'L', "ingotLithium"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port2, 1, 4), new Object[] {" M ", "MPM", " M ", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'M', "ingotMagnesium"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port2, 1, 5), new Object[] {" M ", "MPM", " M ", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'M', "ingotManganese"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port2, 1, 6), new Object[] {" A ", "APA", " A ", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'A', "ingotAluminum"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port2, 1, 7), new Object[] {" I ", "IPI", " I ", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'I', "ingotSilver"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port2, 1, 8), new Object[] {"FFF", "FPF", "FFF", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'F', "gemFluorite"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port2, 1, 9), new Object[] {"VVV", "VPV", "VVV", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'V', "gemVilliaumite"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port2, 1, 10), new Object[] {"CCC", "CPC", "CCC", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'C', "gemCarobbiite"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port2, 1, 11), new Object[] {"AAA", "APA", "AAA", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'A', "dustArsenic"});
		addShapelessFluidRecipe(new ItemStack(NCBlocks.fission_heater_port2, 1, 12), new Object[] {new ItemStack(NCBlocks.fission_heater_port, 1, 0), new BucketIngredient("liquid_nitrogen")});
		addShapelessFluidRecipe(new ItemStack(NCBlocks.fission_heater_port2, 1, 13), new Object[] {new ItemStack(NCBlocks.fission_heater_port, 1, 0), new BucketIngredient("liquid_helium")});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port2, 1, 14), new Object[] {" E ", "EPE", " E ", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'E', "ingotEnderium"});
		addShapedOreRecipe(new ItemStack(NCBlocks.fission_heater_port2, 1, 15), new Object[] {" C ", "CPC", " C ", 'P', new ItemStack(NCBlocks.fission_heater_port, 1, 0), 'C', "dustCryotheum"});
		
		addShapedOreRecipe(NCBlocks.solid_fission_controller, new Object[] {"PTP", "HFH", "PTP", 'P', "plateAdvanced", 'T', "ingotTough", 'H', "ingotHardCarbon", 'F', "steelFrame"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_cell, 4), new Object[] {"PTP", "ZFZ", "PTP", 'P', "plateAdvanced", 'T', "ingotTough", 'Z', "ingotZircaloy", 'F', "steelFrame"});
		addShapelessFluidRecipe(new ItemStack(NCBlocks.solid_fission_sink, 1, 0), new Object[] {"emptyHeatSink", new BucketIngredient("water")});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink, 1, 1), new Object[] {" I ", "ISI", " I ", 'S', "emptyHeatSink", 'I', "ingotIron"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink, 1, 2), new Object[] {"RRR", "RSR", "RRR", 'S', "emptyHeatSink", 'R', "dustRedstone"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink, 1, 3), new Object[] {"QQQ", "QSQ", "QQQ", 'S', "emptyHeatSink", 'Q', "gemQuartz"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink, 1, 4), new Object[] {"DOD", "OSO", "DOD", 'S', "emptyHeatSink", 'O', "obsidian", 'D', "dustObsidian"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink, 1, 5), new Object[] {"INI", "NSN", "INI", 'S', "emptyHeatSink", 'N', Blocks.NETHER_BRICK, 'I', "ingotBrickNether"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink, 1, 6), new Object[] {"GGG", "GSG", "GGG", 'S', "emptyHeatSink", 'G', "dustGlowstone"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink, 1, 7), new Object[] {"LLL", "LSL", "LLL", 'S', "emptyHeatSink", 'L', "gemLapis"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink, 1, 8), new Object[] {" G ", "GSG", " G ", 'S', "emptyHeatSink", 'G', "ingotGold"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink, 1, 9), new Object[] {" P ", "PSP", " P ", 'S', "emptyHeatSink", 'P', "gemPrismarine"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink, 1, 10), new Object[] {"BBB", "BSB", "BBB", 'S', "emptyHeatSink", 'B', "slimeball"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink, 1, 11), new Object[] {"DED", "ESE", "DED", 'S', "emptyHeatSink", 'E', "endstone", 'D', "dustEndstone"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink, 1, 12), new Object[] {"CPC", "PSP", "CPC", 'S', "emptyHeatSink", 'P', Blocks.PURPUR_BLOCK, 'C', Items.CHORUS_FRUIT_POPPED});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink, 1, 13), new Object[] {" D ", "DSD", " D ", 'S', "emptyHeatSink", 'D', "gemDiamond"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink, 1, 14), new Object[] {" E ", "ESE", " E ", 'S', "emptyHeatSink", 'E', "gemEmerald"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink, 1, 15), new Object[] {" C ", "CSC", " C ", 'S', "emptyHeatSink", 'C', "ingotCopper"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink2, 1, 0), new Object[] {" T ", "TST", " T ", 'S', "emptyHeatSink", 'T', "ingotTin"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink2, 1, 1), new Object[] {" L ", "LSL", " L ", 'S', "emptyHeatSink", 'L', "ingotLead"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink2, 1, 2), new Object[] {" B ", "BSB", " B ", 'S', "emptyHeatSink", 'B', "ingotBoron"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink2, 1, 3), new Object[] {" L ", "LSL", " L ", 'S', "emptyHeatSink", 'L', "ingotLithium"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink2, 1, 4), new Object[] {" M ", "MSM", " M ", 'S', "emptyHeatSink", 'M', "ingotMagnesium"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink2, 1, 5), new Object[] {" M ", "MSM", " M ", 'S', "emptyHeatSink", 'M', "ingotManganese"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink2, 1, 6), new Object[] {" A ", "ASA", " A ", 'S', "emptyHeatSink", 'A', "ingotAluminum"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink2, 1, 7), new Object[] {" I ", "ISI", " I ", 'S', "emptyHeatSink", 'I', "ingotSilver"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink2, 1, 8), new Object[] {"FFF", "FSF", "FFF", 'S', "emptyHeatSink", 'F', "gemFluorite"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink2, 1, 9), new Object[] {"VVV", "VSV", "VVV", 'S', "emptyHeatSink", 'V', "gemVilliaumite"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink2, 1, 10), new Object[] {"CCC", "CSC", "CCC", 'S', "emptyHeatSink", 'C', "gemCarobbiite"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink2, 1, 11), new Object[] {"AAA", "ASA", "AAA", 'S', "emptyHeatSink", 'A', "dustArsenic"});
		addShapelessFluidRecipe(new ItemStack(NCBlocks.solid_fission_sink2, 1, 12), new Object[] {"emptyHeatSink", new BucketIngredient("liquid_nitrogen")});
		addShapelessFluidRecipe(new ItemStack(NCBlocks.solid_fission_sink2, 1, 13), new Object[] {"emptyHeatSink", new BucketIngredient("liquid_helium")});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink2, 1, 14), new Object[] {" E ", "ESE", " E ", 'S', "emptyHeatSink", 'E', "ingotEnderium"});
		addShapedOreRecipe(new ItemStack(NCBlocks.solid_fission_sink2, 1, 15), new Object[] {" C ", "CSC", " C ", 'S', "emptyHeatSink", 'C', "dustCryotheum"});
		
		addShapedOreRecipe(NCBlocks.salt_fission_controller, new Object[] {"PEP", "HFH", "PEP", 'P', "plateElite", 'E', "ingotExtreme", 'H', "ingotHardCarbon", 'F', "steelFrame"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_vessel, 4), new Object[] {"PEP", "ZFZ", "PEP", 'P', "plateElite", 'E', "ingotExtreme", 'Z', "ingotZircaloy", 'F', "steelFrame"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater, 8, 0), new Object[] {"PEP", "TFT", "PEP", 'P', "plateElite", 'E', "ingotExtreme", 'T', "ingotThermoconducting", 'F', "steelFrame"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater, 1, 1), new Object[] {" I ", "IHI", " I ", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'I', "ingotIron"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater, 1, 2), new Object[] {"RRR", "RHR", "RRR", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'R', "dustRedstone"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater, 1, 3), new Object[] {"QQQ", "QHQ", "QQQ", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'Q', "gemQuartz"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater, 1, 4), new Object[] {"DOD", "OHO", "DOD", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'O', "obsidian", 'D', "dustObsidian"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater, 1, 5), new Object[] {"INI", "NHN", "INI", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'N', Blocks.NETHER_BRICK, 'I', "ingotBrickNether"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater, 1, 6), new Object[] {"GGG", "GHG", "GGG", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'G', "dustGlowstone"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater, 1, 7), new Object[] {"LLL", "LHL", "LLL", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'L', "gemLapis"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater, 1, 8), new Object[] {" G ", "GHG", " G ", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'G', "ingotGold"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater, 1, 9), new Object[] {" P ", "PHP", " P ", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'P', "gemPrismarine"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater, 1, 10), new Object[] {"BBB", "BHB", "BBB", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'B', "slimeball"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater, 1, 11), new Object[] {"DED", "EHE", "DED", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'E', "endstone", 'D', "dustEndstone"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater, 1, 12), new Object[] {"CPC", "PHP", "CPC", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'P', Blocks.PURPUR_BLOCK, 'C', Items.CHORUS_FRUIT_POPPED});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater, 1, 13), new Object[] {" D ", "DHD", " D ", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'D', "gemDiamond"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater, 1, 14), new Object[] {" E ", "EHE", " E ", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'E', "gemEmerald"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater, 1, 15), new Object[] {" C ", "CHC", " C ", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'C', "ingotCopper"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater2, 1, 0), new Object[] {" T ", "THT", " T ", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'T', "ingotTin"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater2, 1, 1), new Object[] {" L ", "LHL", " L ", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'L', "ingotLead"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater2, 1, 2), new Object[] {" B ", "BHB", " B ", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'B', "ingotBoron"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater2, 1, 3), new Object[] {" L ", "LHL", " L ", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'L', "ingotLithium"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater2, 1, 4), new Object[] {" M ", "MHM", " M ", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'M', "ingotMagnesium"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater2, 1, 5), new Object[] {" M ", "MHM", " M ", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'M', "ingotManganese"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater2, 1, 6), new Object[] {" A ", "AHA", " A ", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'A', "ingotAluminum"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater2, 1, 7), new Object[] {" I ", "IHI", " I ", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'I', "ingotSilver"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater2, 1, 8), new Object[] {"FFF", "FHF", "FFF", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'F', "gemFluorite"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater2, 1, 9), new Object[] {"VVV", "VHV", "VVV", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'V', "gemVilliaumite"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater2, 1, 10), new Object[] {"CCC", "CHC", "CCC", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'C', "gemCarobbiite"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater2, 1, 11), new Object[] {"AAA", "AHA", "AAA", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'A', "dustArsenic"});
		addShapelessFluidRecipe(new ItemStack(NCBlocks.salt_fission_heater2, 1, 12), new Object[] {new ItemStack(NCBlocks.salt_fission_heater, 1, 0), new BucketIngredient("liquid_nitrogen")});
		addShapelessFluidRecipe(new ItemStack(NCBlocks.salt_fission_heater2, 1, 13), new Object[] {new ItemStack(NCBlocks.salt_fission_heater, 1, 0), new BucketIngredient("liquid_helium")});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater2, 1, 14), new Object[] {" E ", "EHE", " E ", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'E', "ingotEnderium"});
		addShapedOreRecipe(new ItemStack(NCBlocks.salt_fission_heater2, 1, 15), new Object[] {" C ", "CHC", " C ", 'H', new ItemStack(NCBlocks.salt_fission_heater, 1, 0), 'C', "dustCryotheum"});
		
		addShapedOreRecipe(NCBlocks.heat_exchanger_controller, new Object[] {"SES", "TFT", "SES", 'S', "stone", 'E', "ingotExtreme", 'T', "ingotThermoconducting", 'F', "steelFrame"});
		addShapedOreRecipe(new ItemStack(NCBlocks.heat_exchanger_casing, 8), new Object[] {" S ", "SFS", " S ", 'S', "stone", 'F', "steelFrame"});
		addShapelessOreRecipe(NCBlocks.heat_exchanger_casing, new Object[] {NCBlocks.heat_exchanger_glass});
		addShapelessOreRecipe(NCBlocks.heat_exchanger_glass, new Object[] {NCBlocks.heat_exchanger_casing, "blockGlass"});
		addShapedOreRecipe(new ItemStack(NCBlocks.heat_exchanger_vent, 4), new Object[] {"SIS", "VFV", "SIS", 'S', "stone", 'I', "ingotSteel", 'V', "servo", 'F', "steelFrame"});
		addShapedOreRecipe(new ItemStack(NCBlocks.heat_exchanger_tube_copper, 4), new Object[] {"SCS", "CFC", "SVS", 'S', "stone", 'C', "ingotCopper", 'F', "steelFrame", 'V', "servo"});
		addShapedOreRecipe(new ItemStack(NCBlocks.heat_exchanger_tube_hard_carbon, 4), new Object[] {"SHS", "HFH", "SVS", 'S', "stone", 'H', "ingotHardCarbon", 'F', "steelFrame", 'V', "servo"});
		addShapedOreRecipe(new ItemStack(NCBlocks.heat_exchanger_tube_thermoconducting, 4), new Object[] {"STS", "TFT", "SVS", 'S', "stone", 'T', "ingotThermoconducting", 'F', "steelFrame", 'V', "servo"});
		addShapelessOreRecipe(NCBlocks.heat_exchanger_tube_copper, new Object[] {NCBlocks.condenser_tube_copper});
		addShapelessOreRecipe(NCBlocks.heat_exchanger_tube_hard_carbon, new Object[] {NCBlocks.condenser_tube_hard_carbon});
		addShapelessOreRecipe(NCBlocks.heat_exchanger_tube_thermoconducting, new Object[] {NCBlocks.condenser_tube_thermoconducting});
		if (ModCheck.openComputersLoaded()) {
			addShapedOreRecipe(NCBlocks.heat_exchanger_computer_port, new Object[] {"SMS", "CFC", "SPS", 'S', "stone", 'M', RegistryHelper.itemStackFromRegistry("opencomputers:material:7"), 'C', RegistryHelper.blockStackFromRegistry("opencomputers:cable:0"), 'P', RegistryHelper.itemStackFromRegistry("opencomputers:material:4"), 'F', "steelFrame"});
		}
		
		addShapedOreRecipe(NCBlocks.condenser_controller, new Object[] {"STS", "CFC", "STS", 'S', "stone", 'T', "ingotTough", 'C', "ingotThermoconducting", 'F', "steelFrame"});
		addShapelessOreRecipe(NCBlocks.condenser_tube_copper, new Object[] {NCBlocks.heat_exchanger_tube_copper});
		addShapelessOreRecipe(NCBlocks.condenser_tube_hard_carbon, new Object[] {NCBlocks.heat_exchanger_tube_hard_carbon});
		addShapelessOreRecipe(NCBlocks.condenser_tube_thermoconducting, new Object[] {NCBlocks.heat_exchanger_tube_thermoconducting});
		
		if (ModCheck.openComputersLoaded()) {
			addShapedOreRecipe(NCBlocks.turbine_computer_port, new Object[] {"SMS", "CFC", "SPS", 'S', "ingotHSLASteel", 'M', RegistryHelper.itemStackFromRegistry("opencomputers:material:7"), 'C', RegistryHelper.blockStackFromRegistry("opencomputers:cable:0"), 'P', RegistryHelper.itemStackFromRegistry("opencomputers:material:4"), 'F', "steelFrame"});
		}
		
		fissionFuelRecipes("Uranium", NCItems.pellet_uranium, NCItems.fuel_uranium, 238, 233, 235);
		fissionFuelRecipes("Neptunium", NCItems.pellet_neptunium, NCItems.fuel_neptunium, 237, 236);
		fissionFuelRecipes("Plutonium", NCItems.pellet_plutonium, NCItems.fuel_plutonium, 242, 239, 241);
		fissionFuelLowEnrichedRecipeAll(NCItems.pellet_mixed, 0, "Uranium238", "Plutonium239", new int[] {0, 1}, "", "Carbide");
		fissionFuelLowEnrichedRecipeAll(NCItems.fuel_mixed, 0, "Uranium238", "Plutonium239", new int[] {1, 2, 3}, "Oxide", "Nitride", "ZA");
		fissionFuelLowEnrichedRecipeAll(NCItems.pellet_mixed, 2, "Uranium238", "Plutonium241", new int[] {0, 1}, "", "Carbide");
		fissionFuelLowEnrichedRecipeAll(NCItems.fuel_mixed, 4, "Uranium238", "Plutonium241", new int[] {1, 2, 3}, "Oxide", "Nitride", "ZA");
		fissionFuelRecipes("Americium", NCItems.pellet_americium, NCItems.fuel_americium, 243, 242);
		fissionFuelRecipes("Curium", NCItems.pellet_curium, NCItems.fuel_curium, 246, 243, 245, 247);
		fissionFuelRecipes("Berkelium", NCItems.pellet_berkelium, NCItems.fuel_berkelium, 247, 248);
		fissionFuelRecipes("Californium", NCItems.pellet_californium, NCItems.fuel_californium, 252, 249, 251);
		
		if (register_quantum) {
			addShapedOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 0), new Object[] {"SES", "ECE", "SES", 'E', "ingotExtreme", 'S', "ingotSteel", 'P', Items.ENDER_PEARL});
			addShapedOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 1), new Object[] {"SES", "ECE", "ESE", 'E', "ingotExtreme", 'S', "ingotSteel", 'P', Items.ENDER_PEARL});
			addShapedOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 2), new Object[] {"SSS", "ECE", "SSS", 'E', "ingotExtreme", 'S', "ingotSteel", 'P', Items.ENDER_PEARL});
			addShapedOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 3), new Object[] {"SES", "SCS", "SES", 'E', "ingotExtreme", 'S', "ingotSteel", 'P', Items.ENDER_PEARL});
			addShapedOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 4), new Object[] {"ESS", "ECE", "SSE", 'E', "ingotExtreme", 'S', "ingotSteel", 'P', Items.ENDER_PEARL});
			addShapedOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 6), new Object[] {"SSS", "ECE", "ESE", 'E', "ingotExtreme", 'S', "ingotSteel", 'P', Items.ENDER_PEARL});
			addShapedOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 8), new Object[] {"SSS", "SCS", "SEE", 'E', "ingotExtreme", 'S', "ingotSteel", 'P', Items.ENDER_PEARL});
			
			addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 0), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_control, 1, 9), Blocks.REDSTONE_TORCH});
			addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 1), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_control, 1, 10), Blocks.REDSTONE_TORCH});
			addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 2), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_control, 1, 11), Blocks.REDSTONE_TORCH});
			addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 4), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_control, 1, 5), Blocks.REDSTONE_TORCH});
			addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 5), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_control, 1, 4), Blocks.REDSTONE_TORCH});
			addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 6), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_control, 1, 7), Blocks.REDSTONE_TORCH});
			addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 7), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_control, 1, 6), Blocks.REDSTONE_TORCH});
			addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 9), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_control, 1, 0), Blocks.REDSTONE_TORCH});
			addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 10), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_control, 1, 1), Blocks.REDSTONE_TORCH});
			addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 11), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_control, 1, 2), Blocks.REDSTONE_TORCH});
			
			addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_control, 1, 0), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 9), "dustRedstone"});
			addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_control, 1, 1), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 10), "dustRedstone"});
			addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_control, 1, 2), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 11), "dustRedstone"});
			addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_control, 1, 4), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 5), "dustRedstone"});
			addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_control, 1, 5), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 4), "dustRedstone"});
			addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_control, 1, 6), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 7), "dustRedstone"});
			addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_control, 1, 7), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 6), "dustRedstone"});
			addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_control, 1, 9), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 0), "dustRedstone"});
			addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_control, 1, 10), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 1), "dustRedstone"});
			addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_control, 1, 11), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_single, 1, 2), "dustRedstone"});
			
			for (int i = 0; i < QuantumGateEnums.SingleType.values().length; i++) {
				addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_single, 1, i), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_control, 1, i)});
				addShapelessOreRecipe(new ItemStack(NCBlocks.quantum_computer_gate_control, 1, i), new Object[] {new ItemStack(NCBlocks.quantum_computer_gate_single, 1, i)});
			}
		}
	}
	
	public static void fissionFuelRecipes(String element, Item pellet, Item fuel, int fertileNo, int... fissileNo) {
		for (int i = 0; i < fissileNo.length; i++) {
			fissionFuelLowEnrichedRecipeAll(pellet, 4 * i, element + fertileNo, element + fissileNo[i], new int[] {0, 1}, "", "Carbide");
			fissionFuelLowEnrichedRecipeAll(fuel, 8 * i, element + fertileNo, element + fissileNo[i], new int[] {1, 2, 3}, "Oxide", "Nitride", "ZA");
			fissionFuelHighlyEnrichedRecipeAll(pellet, 4 * i + 2, element + fertileNo, element + fissileNo[i], new int[] {0, 1}, "", "Carbide");
			fissionFuelHighlyEnrichedRecipeAll(fuel, 8 * i + 4, element + fertileNo, element + fissileNo[i], new int[] {1, 2, 3}, "Oxide", "Nitride", "ZA");
		}
	}
	
	public static void fissionFuelLowEnrichedRecipeAll(Item fuel, int startMeta, String fertile, String fissile, int[] offsets, String... types) {
		for (int i = 0; i < offsets.length; i++) {
			fissionFuelLowEnrichedRecipe(fuel, startMeta + offsets[i], fertile + types[i], fissile + types[i]);
		}
	}
	
	public static void fissionFuelHighlyEnrichedRecipeAll(Item fuel, int startMeta, String fertile, String fissile, int[] offsets, String... types) {
		for (int i = 0; i < offsets.length; i++) {
			fissionFuelHighlyEnrichedRecipe(fuel, startMeta + offsets[i], fertile + types[i], fissile + types[i]);
		}
	}
	
	public static void fissionFuelLowEnrichedRecipe(Item fuel, int meta, String fertile, String fissile) {
		fertile = "ingot" + fertile;
		fissile = "ingot" + fissile;
		addShapelessOreRecipe(new ItemStack(fuel, 9, meta), new Object[] {fissile, fertile, fertile, fertile, fertile, fertile, fertile, fertile, fertile});
	}
	
	public static void fissionFuelHighlyEnrichedRecipe(Item fuel, int meta, String fertile, String fissile) {
		fertile = "ingot" + fertile;
		fissile = "ingot" + fissile;
		addShapelessOreRecipe(new ItemStack(fuel, 9, meta), new Object[] {fissile, fissile, fissile, fertile, fertile, fertile, fertile, fertile, fertile});
	}
	
	public static void blockCompress(Block blockOut, int metaOut, String itemOutOreName, Object itemIn) {
		addShapedOreRecipe(OreDictHelper.getPrioritisedCraftingStack(new ItemStack(blockOut, 1, metaOut), itemOutOreName), new Object[] {"III", "III", "III", 'I', itemIn});
	}
	
	public static void blockOpen(Item itemOut, int metaOut, String itemOutOreName, Object itemIn) {
		addShapelessOreRecipe(OreDictHelper.getPrioritisedCraftingStack(new ItemStack(itemOut, 9, metaOut), itemOutOreName), new Object[] {itemIn});
	}
	
	private static final Object2IntMap<String> RECIPE_COUNT_MAP = new Object2IntOpenHashMap<>();
	
	public static void addShapedOreRecipe(Object out, Object... inputs) {
		registerRecipe(ShapedOreRecipe.class, out, inputs);
	}
	
	public static void addShapedEnergyRecipe(Object out, Object... inputs) {
		registerRecipe(ShapedEnergyRecipe.class, out, inputs);
	}
	
	public static void addShapedFluidRecipe(Object out, Object... inputs) {
		registerRecipe(ShapedFluidRecipe.class, out, inputs);
	}
	
	public static void addShapelessOreRecipe(Object out, Object... inputs) {
		registerRecipe(ShapelessOreRecipe.class, out, inputs);
	}
	
	public static void addShapelessFluidRecipe(Object out, Object... inputs) {
		registerRecipe(ShapelessFluidRecipe.class, out, inputs);
	}
	
	public static void addShapelessArmorUpgradeRecipe(Object out, Object... inputs) {
		registerRecipe(ShapelessArmorRadShieldingRecipe.class, out, inputs);
	}
	
	public static void registerRecipe(Class<? extends IRecipe> clazz, Object out, Object... inputs) {
		if (out == null || Lists.newArrayList(inputs).contains(null)) {
			return;
		}
		ItemStack outStack = StackHelper.fixItemStack(out);
		if (!outStack.isEmpty() && inputs != null) {
			String outName = outStack.getTranslationKey();
			if (RECIPE_COUNT_MAP.containsKey(outName)) {
				int count = RECIPE_COUNT_MAP.getInt(outName);
				RECIPE_COUNT_MAP.put(outName, count + 1);
				outName = outName + "_" + count;
			}
			else {
				RECIPE_COUNT_MAP.put(outName, 1);
			}
			ResourceLocation location = new ResourceLocation(Global.MOD_ID, outName);
			try {
				IRecipe recipe = NCUtil.newInstance(clazz, location, outStack, inputs);
				recipe.setRegistryName(location);
				ForgeRegistries.RECIPES.register(recipe);
			}
			catch (Exception e) {
				
			}
		}
	}
}
