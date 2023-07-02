package me.jissee.chess;

import me.jissee.chess.blocks.BWPieceBlock;
import me.jissee.chess.blocks.BoardBlock;
import me.jissee.chess.blocks.JunqiPieceBlock;
import me.jissee.chess.blocks.XiangqiPieceBlock;
import me.jissee.chess.items.JunqiPieceItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static me.jissee.chess.Chess.MODID;


public class ModRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,MODID);

    public static final RegistryObject<Block> TEMPLATE_T = BLOCKS.register("template",
            () -> new XiangqiPieceBlock(BlockBehaviour.Properties.of().strength(1)));

    public static final RegistryObject<Block> BGENERAL_T = BLOCKS.register("bgeneral",
            () -> new XiangqiPieceBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> BGUARD_T = BLOCKS.register("bguard",
            () -> new XiangqiPieceBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> BMINISTER_T = BLOCKS.register("bminister",
            () -> new XiangqiPieceBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> BHORSE_T = BLOCKS.register("bhorse",
            () -> new XiangqiPieceBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> BROOK_T = BLOCKS.register("brook",
            () -> new XiangqiPieceBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> BCANNON_T = BLOCKS.register("bcannon",
            () -> new XiangqiPieceBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> BSOLDIER_T = BLOCKS.register("bsoldier",
            () -> new XiangqiPieceBlock(BlockBehaviour.Properties.of().strength(1)));

    public static final RegistryObject<Block> RGENERAL_T = BLOCKS.register("rgeneral",
            () -> new XiangqiPieceBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> RGUARD_T = BLOCKS.register("rguard",
            () -> new XiangqiPieceBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> RMINISTER_T = BLOCKS.register("rminister",
            () -> new XiangqiPieceBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> RHORSE_T = BLOCKS.register("rhorse",
            () -> new XiangqiPieceBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> RROOK_T = BLOCKS.register("rrook",
            () -> new XiangqiPieceBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> RCANNON_T = BLOCKS.register("rcannon",
            () -> new XiangqiPieceBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> RSOLDIER_T = BLOCKS.register("rsoldier",
            () -> new XiangqiPieceBlock(BlockBehaviour.Properties.of().strength(1)));

    public static final RegistryObject<Block> WHITEPIECE_T = BLOCKS.register("whitepiece",
            () -> new BWPieceBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> BLACKPIECE_T = BLOCKS.register("blackpiece",
            () -> new BWPieceBlock(BlockBehaviour.Properties.of().strength(1)));





    //public static final RegistryObject<Block> WHITE_P = BLOCKS.register("white_piece",
    //        () -> new FlowerPotBlock(BGENERAL_S.get(),BlockBehaviour.Properties.of().strength(1)));


    public static final RegistryObject<BlockItem> TEMPLATE = ITEMS.register("template",
            () -> new BlockItem(TEMPLATE_T.get(),new Item.Properties()));

    public static final RegistryObject<BlockItem> BGENERAL = ITEMS.register("bgeneral",
            () -> new BlockItem(BGENERAL_T.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> BGUARD = ITEMS.register("bguard",
            () -> new BlockItem(BGUARD_T.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> BMINISTER = ITEMS.register("bminister",
            () -> new BlockItem(BMINISTER_T.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> BHORSE = ITEMS.register("bhorse",
            () -> new BlockItem(BHORSE_T.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> BROOK = ITEMS.register("brook",
            () -> new BlockItem(BROOK_T.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> BCANNON = ITEMS.register("bcannon",
            () -> new BlockItem(BCANNON_T.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> BSOLDIER = ITEMS.register("bsoldier",
            () -> new BlockItem(BSOLDIER_T.get(),new Item.Properties()));

    public static final RegistryObject<BlockItem> RGENERAL = ITEMS.register("rgeneral",
            () -> new BlockItem(RGENERAL_T.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> RGUARD = ITEMS.register("rguard",
            () -> new BlockItem(RGUARD_T.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> RMINISTER = ITEMS.register("rminister",
            () -> new BlockItem(RMINISTER_T.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> RHORSE = ITEMS.register("rhorse",
            () -> new BlockItem(RHORSE_T.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> RROOK = ITEMS.register("rrook",
            () -> new BlockItem(RROOK_T.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> RCANNON = ITEMS.register("rcannon",
            () -> new BlockItem(RCANNON_T.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> RSOLDIER = ITEMS.register("rsoldier",
            () -> new BlockItem(RSOLDIER_T.get(),new Item.Properties()));

    public static final RegistryObject<BlockItem> WHITEPIECE = ITEMS.register("whitepiece",
            () -> new BlockItem(WHITEPIECE_T.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> BLACKPIECE = ITEMS.register("blackpiece",
            () -> new BlockItem(BLACKPIECE_T.get(),new Item.Properties()));



    public static final RegistryObject<Block> CORNER_B = BLOCKS.register("corner",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> TLINE_B = BLOCKS.register("tline",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> CROSS_B = BLOCKS.register("cross",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> MARKED_TLINE_B = BLOCKS.register("marked_tline",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> MARKED_CROSS_B = BLOCKS.register("marked_cross",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> LEFT_I_TLINE_B = BLOCKS.register("left_i_tline",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> RIGHT_I_TLINE_B = BLOCKS.register("right_i_tline",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> ONE_I_CROSS_B = BLOCKS.register("one_i_cross",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> FOUR_I_CROSS_B = BLOCKS.register("four_i_cross",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<Block> POINT_CROSS_B = BLOCKS.register("point_cross",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));


    public static final RegistryObject<BlockItem> CORNER = ITEMS.register("corner",
            () -> new BlockItem(CORNER_B.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> TLINE = ITEMS.register("tline",
            () -> new BlockItem(TLINE_B.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> CROSS = ITEMS.register("cross",
            () -> new BlockItem(CROSS_B.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> MARKED_TLINE = ITEMS.register("marked_tline",
            () -> new BlockItem(MARKED_TLINE_B.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> MARKED_CROSS = ITEMS.register("marked_cross",
            () -> new BlockItem(MARKED_CROSS_B.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> LEFT_I_TLINE = ITEMS.register("left_i_tline",
            () -> new BlockItem(LEFT_I_TLINE_B.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> RIGHT_I_TLINE = ITEMS.register("right_i_tline",
            () -> new BlockItem(RIGHT_I_TLINE_B.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> ONE_I_CROSS = ITEMS.register("one_i_cross",
            () -> new BlockItem(ONE_I_CROSS_B.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> FOUR_I_CROSS = ITEMS.register("four_i_cross",
            () -> new BlockItem(FOUR_I_CROSS_B.get(),new Item.Properties()));
    public static final RegistryObject<BlockItem> POINT_CROSS = ITEMS.register("point_cross",
            () -> new BlockItem(POINT_CROSS_B.get(),new Item.Properties()));







    public static final RegistryObject<Block> TEMPLATEJ_B = BLOCKS.register("template_j",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),0));

    public static final RegistryObject<BlockItem> TEMPLATEJ = ITEMS.register("template_j",
            () -> new JunqiPieceItem(TEMPLATEJ_B.get(),new Item.Properties(),0));


    public static final RegistryObject<Block> BGONGBING_B = BLOCKS.register("bgongbing",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),1));

    public static final RegistryObject<BlockItem> BGONGBING = ITEMS.register("bgongbing",
            () -> new JunqiPieceItem(BGONGBING_B.get(),new Item.Properties(),1));

    public static final RegistryObject<Block> BPAIZHANG_B = BLOCKS.register("bpaizhang",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),2));

    public static final RegistryObject<BlockItem> BPAIZHANG = ITEMS.register("bpaizhang",
            () -> new JunqiPieceItem(BPAIZHANG_B.get(),new Item.Properties(),2));

    public static final RegistryObject<Block> BLIANZHANG_B = BLOCKS.register("blianzhang",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),3));

    public static final RegistryObject<BlockItem> BLIANZHANG = ITEMS.register("blianzhang",
            () -> new JunqiPieceItem(BLIANZHANG_B.get(),new Item.Properties(),3));

    public static final RegistryObject<Block> BYINGZHANG_B = BLOCKS.register("byingzhang",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),4));

    public static final RegistryObject<BlockItem> BYINGZHANG = ITEMS.register("byingzhang",
            () -> new JunqiPieceItem(BYINGZHANG_B.get(),new Item.Properties(),4));

    public static final RegistryObject<Block> BTUANZHANG_B = BLOCKS.register("btuanzhang",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),5));

    public static final RegistryObject<BlockItem> BTUANZHANG = ITEMS.register("btuanzhang",
            () -> new JunqiPieceItem(BTUANZHANG_B.get(),new Item.Properties(),5));

    public static final RegistryObject<Block> BLVZHANG_B = BLOCKS.register("blvzhang",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),6));

    public static final RegistryObject<BlockItem> BLVZHANG = ITEMS.register("blvzhang",
            () -> new JunqiPieceItem(BLVZHANG_B.get(),new Item.Properties(),6));

    public static final RegistryObject<Block> BSHIZHANG_B = BLOCKS.register("bshizhang",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),7));

    public static final RegistryObject<BlockItem> BSHIZHANG = ITEMS.register("bshizhang",
            () -> new JunqiPieceItem(BSHIZHANG_B.get(),new Item.Properties(),7));

    public static final RegistryObject<Block> BJUNZHANG_B = BLOCKS.register("bjunzhang",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),8));

    public static final RegistryObject<BlockItem> BJUNZHANG = ITEMS.register("bjunzhang",
            () -> new JunqiPieceItem(BJUNZHANG_B.get(),new Item.Properties(),8));

    public static final RegistryObject<Block> BSILING_B = BLOCKS.register("bsiling",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),9));

    public static final RegistryObject<BlockItem> BSILING = ITEMS.register("bsiling",
            () -> new JunqiPieceItem(BSILING_B.get(),new Item.Properties(),9));

    public static final RegistryObject<Block> BJUNQI_B = BLOCKS.register("bjunqi",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),0));

    public static final RegistryObject<BlockItem> BJUNQI = ITEMS.register("bjunqi",
            () -> new JunqiPieceItem(BJUNQI_B.get(),new Item.Properties(),0));

    public static final RegistryObject<Block> BZHADAN_B = BLOCKS.register("bzhadan",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),10));

    public static final RegistryObject<BlockItem> BZHADAN = ITEMS.register("bzhadan",
            () -> new JunqiPieceItem(BZHADAN_B.get(),new Item.Properties(),10));

    public static final RegistryObject<Block> BDILEI_B = BLOCKS.register("bdilei",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),11));

    public static final RegistryObject<BlockItem> BDILEI = ITEMS.register("bdilei",
            () -> new JunqiPieceItem(BDILEI_B.get(),new Item.Properties(),11));


    

    
    public static final RegistryObject<Block> RGONGBING_B = BLOCKS.register("rgongbing",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),1));

    public static final RegistryObject<BlockItem> RGONGBING = ITEMS.register("rgongbing",
            () -> new JunqiPieceItem(RGONGBING_B.get(),new Item.Properties(),1));

    public static final RegistryObject<Block> RPAIZHANG_B = BLOCKS.register("rpaizhang",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),2));

    public static final RegistryObject<BlockItem> RPAIZHANG = ITEMS.register("rpaizhang",
            () -> new JunqiPieceItem(RPAIZHANG_B.get(),new Item.Properties(),2));

    public static final RegistryObject<Block> RLIANZHANG_B = BLOCKS.register("rlianzhang",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),3));

    public static final RegistryObject<BlockItem> RLIANZHANG = ITEMS.register("rlianzhang",
            () -> new JunqiPieceItem(RLIANZHANG_B.get(),new Item.Properties(),3));

    public static final RegistryObject<Block> RYINGZHANG_B = BLOCKS.register("ryingzhang",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),4));

    public static final RegistryObject<BlockItem> RYINGZHANG = ITEMS.register("ryingzhang",
            () -> new JunqiPieceItem(RYINGZHANG_B.get(),new Item.Properties(),4));

    public static final RegistryObject<Block> RTUANZHANG_B = BLOCKS.register("rtuanzhang",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),5));

    public static final RegistryObject<BlockItem> RTUANZHANG = ITEMS.register("rtuanzhang",
            () -> new JunqiPieceItem(RTUANZHANG_B.get(),new Item.Properties(),5));

    public static final RegistryObject<Block> RLVZHANG_B = BLOCKS.register("rlvzhang",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),6));

    public static final RegistryObject<BlockItem> RLVZHANG = ITEMS.register("rlvzhang",
            () -> new JunqiPieceItem(RLVZHANG_B.get(),new Item.Properties(),6));

    public static final RegistryObject<Block> RSHIZHANG_B = BLOCKS.register("rshizhang",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),7));

    public static final RegistryObject<BlockItem> RSHIZHANG = ITEMS.register("rshizhang",
            () -> new JunqiPieceItem(RSHIZHANG_B.get(),new Item.Properties(),7));

    public static final RegistryObject<Block> RJUNZHANG_B = BLOCKS.register("rjunzhang",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),8));

    public static final RegistryObject<BlockItem> RJUNZHANG = ITEMS.register("rjunzhang",
            () -> new JunqiPieceItem(RJUNZHANG_B.get(),new Item.Properties(),8));

    public static final RegistryObject<Block> RSILING_B = BLOCKS.register("rsiling",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),9));

    public static final RegistryObject<BlockItem> RSILING = ITEMS.register("rsiling",
            () -> new JunqiPieceItem(RSILING_B.get(),new Item.Properties(),9));

    public static final RegistryObject<Block> RJUNQI_B = BLOCKS.register("rjunqi",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),0));

    public static final RegistryObject<BlockItem> RJUNQI = ITEMS.register("rjunqi",
            () -> new JunqiPieceItem(RJUNQI_B.get(),new Item.Properties(),0));

    public static final RegistryObject<Block> RZHADAN_B = BLOCKS.register("rzhadan",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),10));

    public static final RegistryObject<BlockItem> RZHADAN = ITEMS.register("rzhadan",
            () -> new JunqiPieceItem(RZHADAN_B.get(),new Item.Properties(),10));

    public static final RegistryObject<Block> RDILEI_B = BLOCKS.register("rdilei",
            () -> new JunqiPieceBlock(BlockBehaviour.Properties.of().strength(1),11));

    public static final RegistryObject<BlockItem> RDILEI = ITEMS.register("rdilei",
            () -> new JunqiPieceItem(RDILEI_B.get(),new Item.Properties(),11));


    public static final RegistryObject<Block> ST_STCAMP_B = BLOCKS.register("st_stcamp",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<BlockItem> ST_STCAMP = ITEMS.register("st_stcamp",
            () -> new BlockItem(ST_STCAMP_B.get(),new Item.Properties()));
    public static final RegistryObject<Block> ST_STBASE_B = BLOCKS.register("st_stbase",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<BlockItem> ST_STBASE = ITEMS.register("st_stbase",
            () -> new BlockItem(ST_STBASE_B.get(),new Item.Properties()));
    public static final RegistryObject<Block> ST_CORNER_B = BLOCKS.register("st_corner",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<BlockItem> ST_CORNER = ITEMS.register("st_corner",
            () -> new BlockItem(ST_CORNER_B.get(),new Item.Properties()));
    public static final RegistryObject<Block> ST_CROSS_B = BLOCKS.register("st_cross",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<BlockItem> ST_CROSS = ITEMS.register("st_cross",
            () -> new BlockItem(ST_CROSS_B.get(),new Item.Properties()));
    public static final RegistryObject<Block> ST_CROSS_ONE_RAIL_B = BLOCKS.register("st_cross_one_rail",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<BlockItem> ST_CROSS_ONE_RAIL = ITEMS.register("st_cross_one_rail",
            () -> new BlockItem(ST_CROSS_ONE_RAIL_B.get(),new Item.Properties()));
    public static final RegistryObject<Block> ST_LEFT_L_RAIL_B = BLOCKS.register("st_left_l_rail",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<BlockItem> ST_LEFT_L_RAIL = ITEMS.register("st_left_l_rail",
            () -> new BlockItem(ST_LEFT_L_RAIL_B.get(),new Item.Properties()));
    public static final RegistryObject<Block> ST_LEFT_TOP_T_RAIL_B = BLOCKS.register("st_left_top_t_rail",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<BlockItem> ST_LEFT_TOP_T_RAIL = ITEMS.register("st_left_top_t_rail",
            () -> new BlockItem(ST_LEFT_TOP_T_RAIL_B.get(),new Item.Properties()));
    public static final RegistryObject<Block> ST_ONE_RAIL_B = BLOCKS.register("st_one_rail",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<BlockItem> ST_ONE_RAIL = ITEMS.register("st_one_rail",
            () -> new BlockItem(ST_ONE_RAIL_B.get(),new Item.Properties()));
    public static final RegistryObject<Block> ST_RIGHT_TOP_T_RAIL_B = BLOCKS.register("st_right_top_t_rail",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<BlockItem> ST_RIGHT_TOP_T_RAIL = ITEMS.register("st_right_top_t_rail",
            () -> new BlockItem(ST_RIGHT_TOP_T_RAIL_B.get(),new Item.Properties()));
    public static final RegistryObject<Block> ST_RIGHT_L_RAIL_B = BLOCKS.register("st_right_l_rail",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<BlockItem> ST_RIGHT_L_RAIL = ITEMS.register("st_right_l_rail",
            () -> new BlockItem(ST_RIGHT_L_RAIL_B.get(),new Item.Properties()));
    public static final RegistryObject<Block> ST_TLINE_B = BLOCKS.register("st_tline",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<BlockItem> ST_TLINE = ITEMS.register("st_tline",
            () -> new BlockItem(ST_TLINE_B.get(),new Item.Properties()));
    public static final RegistryObject<Block> ST_TLINE_ONE_RAIL_B = BLOCKS.register("st_tline_one_rail",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<BlockItem> ST_TLINE_ONE_RAIL = ITEMS.register("st_tline_one_rail",
            () -> new BlockItem(ST_TLINE_ONE_RAIL_B.get(),new Item.Properties()));
    public static final RegistryObject<Block> ST_TV_ONE_RAIL_B = BLOCKS.register("st_tv_one_rail",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<BlockItem> ST_TV_ONE_RAIL = ITEMS.register("st_tv_one_rail",
            () -> new BlockItem(ST_TV_ONE_RAIL_B.get(),new Item.Properties()));
    public static final RegistryObject<Block> ST_V_CROSS_ONE_RAIL_B = BLOCKS.register("st_v_cross_one_rail",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<BlockItem> ST_V_CROSS_ONE_RAIL = ITEMS.register("st_v_cross_one_rail",
            () -> new BlockItem(ST_V_CROSS_ONE_RAIL_B.get(),new Item.Properties()));
    public static final RegistryObject<Block> ST_V_CROSS_T_RAIL_B = BLOCKS.register("st_v_cross_t_rail",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<BlockItem> ST_V_CROSS_T_RAIL = ITEMS.register("st_v_cross_t_rail",
            () -> new BlockItem(ST_V_CROSS_T_RAIL_B.get(),new Item.Properties()));

    public static final RegistryObject<Block> ST_STBLANK_B = BLOCKS.register("st_stblank",
            () -> new BoardBlock(BlockBehaviour.Properties.of().strength(1)));
    public static final RegistryObject<BlockItem> ST_STBLANK = ITEMS.register("st_stblank",
            () -> new BlockItem(ST_STBLANK_B.get(),new Item.Properties()));


    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final RegistryObject<CreativeModeTab> CHINESE_CHESS_TAB = TABS.register("chinese_chess_tab", ()->
            CreativeModeTab.builder().withTabsAfter(ModRegistry.MILITARY_CHESS_TAB.getKey())
                    .title(Component.translatable("itemgroup.xiangqi"))
                    .icon(() -> new ItemStack(BMINISTER.get()))
                    .displayItems((parameters, output) -> {
                                output.accept(TEMPLATE.get());
                                output.accept(BGENERAL.get());
                                output.accept(BGUARD.get());
                                output.accept(BMINISTER .get());
                                output.accept(BHORSE.get());
                                output.accept(BROOK.get());
                                output.accept(BCANNON .get());
                                output.accept(BSOLDIER.get());

                                output.accept(RGENERAL.get());
                                output.accept(RGUARD.get());
                                output.accept(RMINISTER.get());
                                output.accept(RHORSE.get());
                                output.accept(RROOK.get());
                                output.accept(RCANNON.get());
                                output.accept(RSOLDIER.get());
                                output.accept(WHITEPIECE.get());
                                output.accept(BLACKPIECE.get());

                                output.accept(CORNER.get());
                                output.accept(TLINE.get());
                                output.accept(CROSS.get());
                                output.accept(MARKED_TLINE.get());
                                output.accept(MARKED_CROSS.get());
                                output.accept(LEFT_I_TLINE.get());
                                output.accept(RIGHT_I_TLINE.get());
                                output.accept(ONE_I_CROSS.get());
                                output.accept(FOUR_I_CROSS.get());
                                output.accept(POINT_CROSS.get());

                            }
                    )
                    .build()
    );
    public static final RegistryObject<CreativeModeTab> MILITARY_CHESS_TAB = TABS.register("military_chess_tab", () ->
            CreativeModeTab.builder()
            .title(Component.translatable("itemgroup.junqi"))
            .icon(() -> new ItemStack(BJUNZHANG.get()))
            .displayItems(
                    (parameters, output) -> {
                        output.accept(TEMPLATEJ.get());

                        output.accept(BGONGBING.get());
                        output.accept(BPAIZHANG.get());
                        output.accept(BLIANZHANG.get());
                        output.accept(BYINGZHANG.get());
                        output.accept(BTUANZHANG.get());
                        output.accept(BLVZHANG.get());
                        output.accept(BSHIZHANG.get());
                        output.accept(BJUNZHANG.get());
                        output.accept(BSILING.get());
                        output.accept(BJUNQI.get());
                        output.accept(BZHADAN.get());
                        output.accept(BDILEI.get());

                        output.accept(RGONGBING.get());
                        output.accept(RPAIZHANG.get());
                        output.accept(RLIANZHANG.get());
                        output.accept(RYINGZHANG.get());
                        output.accept(RTUANZHANG.get());
                        output.accept(RLVZHANG.get());
                        output.accept(RSHIZHANG.get());
                        output.accept(RJUNZHANG.get());
                        output.accept(RSILING.get());
                        output.accept(RJUNQI.get());
                        output.accept(RZHADAN.get());
                        output.accept(RDILEI.get());

                        output.accept(ST_STCAMP.get());
                        output.accept(ST_STBASE.get());
                        output.accept(ST_CORNER.get());
                        output.accept(ST_CROSS.get());
                        output.accept(ST_CROSS_ONE_RAIL .get());
                        output.accept(ST_LEFT_L_RAIL.get());
                        output.accept(ST_LEFT_TOP_T_RAIL.get());
                        output.accept(ST_ONE_RAIL.get());
                        output.accept(ST_RIGHT_TOP_T_RAIL.get());
                        output.accept(ST_RIGHT_L_RAIL.get());
                        output.accept(ST_TLINE.get());
                        output.accept(ST_TLINE_ONE_RAIL.get());
                        output.accept(ST_TV_ONE_RAIL.get());
                        output.accept(ST_V_CROSS_ONE_RAIL.get());
                        output.accept(ST_V_CROSS_T_RAIL.get());
                        output.accept(ST_STBLANK.get());

                    }
            )
            .build());
}
