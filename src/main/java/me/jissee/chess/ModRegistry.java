package me.jissee.chess;

import me.jissee.chess.blocks.BWPieceBlock;
import me.jissee.chess.blocks.BoardBlock;
import me.jissee.chess.blocks.JunqiPieceBlock;
import me.jissee.chess.blocks.XiangqiPieceBlock;
import me.jissee.chess.items.JunqiPieceItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static me.jissee.chess.Chess.MODID;


public class ModRegistry {



    public static final XiangqiPieceBlock TEMPLATE = new XiangqiPieceBlock(FabricBlockSettings.create().strength(1f));


    public static final XiangqiPieceBlock BGENERAL = new XiangqiPieceBlock(FabricBlockSettings.create().strength(1f));
    public static final XiangqiPieceBlock BGUARD = new XiangqiPieceBlock(FabricBlockSettings.create().strength(1f));
    public static final XiangqiPieceBlock BMINISTER = new XiangqiPieceBlock(FabricBlockSettings.create().strength(1f));
    public static final XiangqiPieceBlock BHORSE = new XiangqiPieceBlock(FabricBlockSettings.create().strength(1f));
    public static final XiangqiPieceBlock BROOK = new XiangqiPieceBlock(FabricBlockSettings.create().strength(1f));
    public static final XiangqiPieceBlock BCANNON = new XiangqiPieceBlock(FabricBlockSettings.create().strength(1f));
    public static final XiangqiPieceBlock BSOLDIER = new XiangqiPieceBlock(FabricBlockSettings.create().strength(1f));
    public static final XiangqiPieceBlock RGENERAL = new XiangqiPieceBlock(FabricBlockSettings.create().strength(1f));
    public static final XiangqiPieceBlock RGUARD = new XiangqiPieceBlock(FabricBlockSettings.create().strength(1f));
    public static final XiangqiPieceBlock RMINISTER = new XiangqiPieceBlock(FabricBlockSettings.create().strength(1f));
    public static final XiangqiPieceBlock RHORSE = new XiangqiPieceBlock(FabricBlockSettings.create().strength(1f));
    public static final XiangqiPieceBlock RROOK = new XiangqiPieceBlock(FabricBlockSettings.create().strength(1f));
    public static final XiangqiPieceBlock RCANNON = new XiangqiPieceBlock(FabricBlockSettings.create().strength(1f));
    public static final XiangqiPieceBlock RSOLDIER = new XiangqiPieceBlock(FabricBlockSettings.create().strength(1f));

    public static final BWPieceBlock WHITEPIECE = new BWPieceBlock(FabricBlockSettings.create().strength(1f));
    public static final BWPieceBlock BLACKPIECE = new BWPieceBlock(FabricBlockSettings.create().strength(1f));

    public static final BoardBlock CORNER = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock TLINE = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock CROSS = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock MARKED_TLINE = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock MARKED_CROSS = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock LEFT_I_TLINE = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock RIGHT_I_TLINE = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock ONE_I_CROSS = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock FOUR_I_CROSS = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock POINT_CROSS = new BoardBlock(FabricBlockSettings.create().strength(1f));



    public static final JunqiPieceBlock TEMPLATEJ = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),0);
    public static final JunqiPieceBlock BGONGBING = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),1);
    public static final JunqiPieceBlock BPAIZHANG = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),2);
    public static final JunqiPieceBlock BLIANZHANG = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),3);
    public static final JunqiPieceBlock BYINGZHANG = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),4);
    public static final JunqiPieceBlock BTUANZHANG = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),5);
    public static final JunqiPieceBlock BLVZHANG = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),6);
    public static final JunqiPieceBlock BSHIZHANG = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),7);
    public static final JunqiPieceBlock BJUNZHANG = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),8);
    public static final JunqiPieceBlock BSILING = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),9);
    public static final JunqiPieceBlock BJUNQI = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),0);
    public static final JunqiPieceBlock BZHADAN = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),10);
    public static final JunqiPieceBlock BDILEI = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),11);

    public static final JunqiPieceBlock RGONGBING = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),1);
    public static final JunqiPieceBlock RPAIZHANG = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),2);
    public static final JunqiPieceBlock RLIANZHANG = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),3);
    public static final JunqiPieceBlock RYINGZHANG = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),4);
    public static final JunqiPieceBlock RTUANZHANG = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),5);
    public static final JunqiPieceBlock RLVZHANG = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),6);
    public static final JunqiPieceBlock RSHIZHANG = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),7);
    public static final JunqiPieceBlock RJUNZHANG = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),8);
    public static final JunqiPieceBlock RSILING = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),9);
    public static final JunqiPieceBlock RJUNQI = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),0);
    public static final JunqiPieceBlock RZHADAN = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),10);
    public static final JunqiPieceBlock RDILEI = new JunqiPieceBlock(FabricBlockSettings.create().strength(1f),11);
    public static final BoardBlock ST_STCAMP = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock ST_STBASE = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock ST_CORNER = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock ST_CROSS = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock ST_CROSS_ONE_RAIL = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock ST_LEFT_L_RAIL = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock ST_LEFT_TOP_T_RAIL = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock ST_ONE_RAIL = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock ST_RIGHT_TOP_T_RAIL = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock ST_RIGHT_L_RAIL = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock ST_TLINE = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock ST_TLINE_ONE_RAIL = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock ST_TV_ONE_RAIL = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock ST_V_CROSS_ONE_RAIL = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock ST_V_CROSS_T_RAIL = new BoardBlock(FabricBlockSettings.create().strength(1f));
    public static final BoardBlock ST_STBLANK = new BoardBlock(FabricBlockSettings.create().strength(1f));


    private static final RegistryKey<ItemGroup> XIANGQI_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MODID, "xiangqi"));
    private static final RegistryKey<ItemGroup> JUNQI_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MODID, "junqi"));


    public static void setupBlock() {

        Registry.register(Registries.BLOCK,new Identifier(MODID, "template"), TEMPLATE);
        Registry.register(Registries.ITEM, new Identifier(MODID, "template"),
                new BlockItem(TEMPLATE, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "bgeneral"), BGENERAL);
        Registry.register(Registries.ITEM, new Identifier(MODID, "bgeneral"),
                new BlockItem(BGENERAL, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "bguard"), BGUARD);
        Registry.register(Registries.ITEM, new Identifier(MODID, "bguard"),
                new BlockItem(BGUARD, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "bminister"), BMINISTER);
        Registry.register(Registries.ITEM, new Identifier(MODID, "bminister"),
                new BlockItem(BMINISTER, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "bhorse"), BHORSE);
        Registry.register(Registries.ITEM, new Identifier(MODID, "bhorse"),
                new BlockItem(BHORSE, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "brook"), BROOK);
        Registry.register(Registries.ITEM, new Identifier(MODID, "brook"),
                new BlockItem(BROOK, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "bcannon"), BCANNON);
        Registry.register(Registries.ITEM, new Identifier(MODID, "bcannon"),
                new BlockItem(BCANNON, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "bsoldier"), BSOLDIER);
        Registry.register(Registries.ITEM, new Identifier(MODID, "bsoldier"),
                new BlockItem(BSOLDIER, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "rgeneral"), RGENERAL);
        Registry.register(Registries.ITEM, new Identifier(MODID, "rgeneral"),
                new BlockItem(RGENERAL, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "rguard"), RGUARD);
        Registry.register(Registries.ITEM, new Identifier(MODID, "rguard"),
                new BlockItem(RGUARD, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "rminister"), RMINISTER);
        Registry.register(Registries.ITEM, new Identifier(MODID, "rminister"),
                new BlockItem(RMINISTER, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "rhorse"), RHORSE);
        Registry.register(Registries.ITEM, new Identifier(MODID, "rhorse"),
                new BlockItem(RHORSE, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "rrook"), RROOK);
        Registry.register(Registries.ITEM, new Identifier(MODID, "rrook"),
                new BlockItem(RROOK, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "rcannon"), RCANNON);
        Registry.register(Registries.ITEM, new Identifier(MODID, "rcannon"),
                new BlockItem(RCANNON, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "rsoldier"), RSOLDIER);
        Registry.register(Registries.ITEM, new Identifier(MODID, "rsoldier"),
                new BlockItem(RSOLDIER, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "whitepiece"), WHITEPIECE);
        Registry.register(Registries.ITEM, new Identifier(MODID, "whitepiece"),
                new BlockItem(WHITEPIECE, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "blackpiece"), BLACKPIECE);
        Registry.register(Registries.ITEM, new Identifier(MODID, "blackpiece"),
                new BlockItem(BLACKPIECE, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "corner"), CORNER);
        Registry.register(Registries.ITEM, new Identifier(MODID, "corner"),
                new BlockItem(CORNER, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "tline"), TLINE);
        Registry.register(Registries.ITEM, new Identifier(MODID, "tline"),
                new BlockItem(TLINE, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "cross"), CROSS);
        Registry.register(Registries.ITEM, new Identifier(MODID, "cross"),
                new BlockItem(CROSS, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "marked_tline"), MARKED_TLINE);
        Registry.register(Registries.ITEM, new Identifier(MODID, "marked_tline"),
                new BlockItem(MARKED_TLINE, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "marked_cross"), MARKED_CROSS);
        Registry.register(Registries.ITEM, new Identifier(MODID, "marked_cross"),
                new BlockItem(MARKED_CROSS, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "left_i_tline"), LEFT_I_TLINE);
        Registry.register(Registries.ITEM, new Identifier(MODID, "left_i_tline"),
                new BlockItem(LEFT_I_TLINE, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "right_i_tline"), RIGHT_I_TLINE);
        Registry.register(Registries.ITEM, new Identifier(MODID, "right_i_tline"),
                new BlockItem(RIGHT_I_TLINE, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "one_i_cross"), ONE_I_CROSS);
        Registry.register(Registries.ITEM, new Identifier(MODID, "one_i_cross"),
                new BlockItem(ONE_I_CROSS, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "four_i_cross"), FOUR_I_CROSS);
        Registry.register(Registries.ITEM, new Identifier(MODID, "four_i_cross"),
                new BlockItem(FOUR_I_CROSS, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "point_cross"), POINT_CROSS);
        Registry.register(Registries.ITEM, new Identifier(MODID, "point_cross"),
                new BlockItem(POINT_CROSS, new Item.Settings()));





        Registry.register(Registries.BLOCK,new Identifier(MODID, "template_j"), TEMPLATEJ);
        Registry.register(Registries.ITEM, new Identifier(MODID, "template_j"),
                new JunqiPieceItem(TEMPLATEJ, new Item.Settings(),0));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "bgongbing"), BGONGBING);
        Registry.register(Registries.ITEM, new Identifier(MODID, "bgongbing"),
                new JunqiPieceItem(BGONGBING, new Item.Settings(), 1));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "bpaizhang"), BPAIZHANG);
        Registry.register(Registries.ITEM, new Identifier(MODID, "bpaizhang"),
                new JunqiPieceItem(BPAIZHANG, new Item.Settings(), 2));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "blianzhang"), BLIANZHANG);
        Registry.register(Registries.ITEM, new Identifier(MODID, "blianzhang"),
                new JunqiPieceItem(BLIANZHANG, new Item.Settings(), 3));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "byingzhang"), BYINGZHANG);
        Registry.register(Registries.ITEM, new Identifier(MODID, "byingzhang"),
                new JunqiPieceItem(BYINGZHANG, new Item.Settings(), 4));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "btuanzhang"), BTUANZHANG);
        Registry.register(Registries.ITEM, new Identifier(MODID, "btuanzhang"),
                new JunqiPieceItem(BTUANZHANG, new Item.Settings(), 5));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "blvzhang"), BLVZHANG);
        Registry.register(Registries.ITEM, new Identifier(MODID, "blvzhang"),
                new JunqiPieceItem(BLVZHANG, new Item.Settings(), 6));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "bshizhang"), BSHIZHANG);
        Registry.register(Registries.ITEM, new Identifier(MODID, "bshizhang"),
                new JunqiPieceItem(BSHIZHANG, new Item.Settings(), 7));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "bjunzhang"), BJUNZHANG);
        Registry.register(Registries.ITEM, new Identifier(MODID, "bjunzhang"),
                new JunqiPieceItem(BJUNZHANG, new Item.Settings(), 8));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "bsiling"), BSILING);
        Registry.register(Registries.ITEM, new Identifier(MODID, "bsiling"),
                new JunqiPieceItem(BSILING, new Item.Settings(), 9));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "bjunqi"), BJUNQI);
        Registry.register(Registries.ITEM, new Identifier(MODID, "bjunqi"),
                new JunqiPieceItem(BJUNQI, new Item.Settings(), 0));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "bzhadan"), BZHADAN);
        Registry.register(Registries.ITEM, new Identifier(MODID, "bzhadan"),
                new JunqiPieceItem(BZHADAN, new Item.Settings(), 10));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "bdilei"), BDILEI);
        Registry.register(Registries.ITEM, new Identifier(MODID, "bdilei"),
                new JunqiPieceItem(BDILEI, new Item.Settings(), 11));



        Registry.register(Registries.BLOCK,new Identifier(MODID, "rgongbing"), RGONGBING);
        Registry.register(Registries.ITEM, new Identifier(MODID, "rgongbing"),
                new JunqiPieceItem(RGONGBING, new Item.Settings(), 1));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "rpaizhang"), RPAIZHANG);
        Registry.register(Registries.ITEM, new Identifier(MODID, "rpaizhang"),
                new JunqiPieceItem(RPAIZHANG, new Item.Settings(), 2));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "rlianzhang"), RLIANZHANG);
        Registry.register(Registries.ITEM, new Identifier(MODID, "rlianzhang"),
                new JunqiPieceItem(RLIANZHANG, new Item.Settings(), 3));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "ryingzhang"), RYINGZHANG);
        Registry.register(Registries.ITEM, new Identifier(MODID, "ryingzhang"),
                new JunqiPieceItem(RYINGZHANG, new Item.Settings(), 4));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "rtuanzhang"), RTUANZHANG);
        Registry.register(Registries.ITEM, new Identifier(MODID, "rtuanzhang"),
                new JunqiPieceItem(RTUANZHANG, new Item.Settings(), 5));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "rlvzhang"), RLVZHANG);
        Registry.register(Registries.ITEM, new Identifier(MODID, "rlvzhang"),
                new JunqiPieceItem(RLVZHANG, new Item.Settings(), 6));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "rshizhang"), RSHIZHANG);
        Registry.register(Registries.ITEM, new Identifier(MODID, "rshizhang"),
                new JunqiPieceItem(RSHIZHANG, new Item.Settings(), 7));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "rjunzhang"), RJUNZHANG);
        Registry.register(Registries.ITEM, new Identifier(MODID, "rjunzhang"),
                new JunqiPieceItem(RJUNZHANG, new Item.Settings(), 8));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "rsiling"), RSILING);
        Registry.register(Registries.ITEM, new Identifier(MODID, "rsiling"),
                new JunqiPieceItem(RSILING, new Item.Settings(), 9));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "rjunqi"), RJUNQI);
        Registry.register(Registries.ITEM, new Identifier(MODID, "rjunqi"),
                new JunqiPieceItem(RJUNQI, new Item.Settings(), 0));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "rzhadan"), RZHADAN);
        Registry.register(Registries.ITEM, new Identifier(MODID, "rzhadan"),
                new JunqiPieceItem(RZHADAN, new Item.Settings(), 10));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "rdilei"), RDILEI);
        Registry.register(Registries.ITEM, new Identifier(MODID, "rdilei"),
                new JunqiPieceItem(RDILEI, new Item.Settings(), 11));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "st_stcamp"), ST_STCAMP);
        Registry.register(Registries.ITEM, new Identifier(MODID, "st_stcamp"),
                new BlockItem(ST_STCAMP, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "st_stbase"), ST_STBASE);
        Registry.register(Registries.ITEM, new Identifier(MODID, "st_stbase"),
                new BlockItem(ST_STBASE, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "st_corner"), ST_CORNER);
        Registry.register(Registries.ITEM, new Identifier(MODID, "st_corner"),
                new BlockItem(ST_CORNER, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "st_cross"), ST_CROSS);
        Registry.register(Registries.ITEM, new Identifier(MODID, "st_cross"),
                new BlockItem(ST_CROSS, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "st_cross_one_rail"), ST_CROSS_ONE_RAIL);
        Registry.register(Registries.ITEM, new Identifier(MODID, "st_cross_one_rail"),
                new BlockItem(ST_CROSS_ONE_RAIL, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "st_left_l_rail"), ST_LEFT_L_RAIL);
        Registry.register(Registries.ITEM, new Identifier(MODID, "st_left_l_rail"),
                new BlockItem(ST_LEFT_L_RAIL, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "st_left_top_t_rail"), ST_LEFT_TOP_T_RAIL);
        Registry.register(Registries.ITEM, new Identifier(MODID, "st_left_top_t_rail"),
                new BlockItem(ST_LEFT_TOP_T_RAIL, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "st_one_rail"), ST_ONE_RAIL);
        Registry.register(Registries.ITEM, new Identifier(MODID, "st_one_rail"),
                new BlockItem(ST_ONE_RAIL, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "st_right_top_t_rail"), ST_RIGHT_TOP_T_RAIL);
        Registry.register(Registries.ITEM, new Identifier(MODID, "st_right_top_t_rail"),
                new BlockItem(ST_RIGHT_TOP_T_RAIL, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "st_right_l_rail"), ST_RIGHT_L_RAIL);
        Registry.register(Registries.ITEM, new Identifier(MODID, "st_right_l_rail"),
                new BlockItem(ST_RIGHT_L_RAIL, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "st_tline"), ST_TLINE);
        Registry.register(Registries.ITEM, new Identifier(MODID, "st_tline"),
                new BlockItem(ST_TLINE, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "st_tline_one_rail"), ST_TLINE_ONE_RAIL);
        Registry.register(Registries.ITEM, new Identifier(MODID, "st_tline_one_rail"),
                new BlockItem(ST_TLINE_ONE_RAIL, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "st_tv_one_rail"), ST_TV_ONE_RAIL);
        Registry.register(Registries.ITEM, new Identifier(MODID, "st_tv_one_rail"),
                new BlockItem(ST_TV_ONE_RAIL, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "st_v_cross_one_rail"), ST_V_CROSS_ONE_RAIL);
        Registry.register(Registries.ITEM, new Identifier(MODID, "st_v_cross_one_rail"),
                new BlockItem(ST_V_CROSS_ONE_RAIL, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "st_v_cross_t_rail"), ST_V_CROSS_T_RAIL);
        Registry.register(Registries.ITEM, new Identifier(MODID, "st_v_cross_t_rail"),
                new BlockItem(ST_V_CROSS_T_RAIL, new Item.Settings()));

        Registry.register(Registries.BLOCK,new Identifier(MODID, "st_stblank"), ST_STBLANK);
        Registry.register(Registries.ITEM, new Identifier(MODID, "st_stblank"),
                new BlockItem(ST_STBLANK, new Item.Settings()));

        Registry.register(Registries.ITEM_GROUP, ModRegistry.XIANGQI_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("itemgroup.xiangqi"))
                .icon(() -> new ItemStack(BMINISTER))
                .entries(
                        (feature, entries) ->{
                            entries.add(TEMPLATE);
                            entries.add(BGENERAL);
                            entries.add(BGUARD);
                            entries.add(BMINISTER );
                            entries.add(BHORSE);
                            entries.add(BROOK);
                            entries.add(BCANNON );
                            entries.add(BSOLDIER);

                            entries.add(RGENERAL);
                            entries.add(RGUARD);
                            entries.add(RMINISTER);
                            entries.add(RHORSE);
                            entries.add(RROOK);
                            entries.add(RCANNON);
                            entries.add(RSOLDIER);
                            entries.add(WHITEPIECE);
                            entries.add(BLACKPIECE);

                            entries.add(CORNER);
                            entries.add(TLINE);
                            entries.add(CROSS);
                            entries.add(MARKED_TLINE);
                            entries.add(MARKED_CROSS);
                            entries.add(LEFT_I_TLINE);
                            entries.add(RIGHT_I_TLINE);
                            entries.add(ONE_I_CROSS);
                            entries.add(FOUR_I_CROSS);
                            entries.add(POINT_CROSS);
                        }
                )

                .build()
        );

        Registry.register(Registries.ITEM_GROUP, ModRegistry.JUNQI_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("itemgroup.junqi"))
                .icon(() -> new ItemStack(BJUNZHANG))
                .entries(
                        (feature, entries) ->{
                            entries.add(TEMPLATEJ);

                            entries.add(BGONGBING);
                            entries.add(BPAIZHANG);
                            entries.add(BLIANZHANG);
                            entries.add(BYINGZHANG);
                            entries.add(BTUANZHANG);
                            entries.add(BLVZHANG);
                            entries.add(BSHIZHANG);
                            entries.add(BJUNZHANG);
                            entries.add(BSILING);
                            entries.add(BJUNQI);
                            entries.add(BZHADAN);
                            entries.add(BDILEI);

                            entries.add(RGONGBING);
                            entries.add(RPAIZHANG);
                            entries.add(RLIANZHANG);
                            entries.add(RYINGZHANG);
                            entries.add(RTUANZHANG);
                            entries.add(RLVZHANG);
                            entries.add(RSHIZHANG);
                            entries.add(RJUNZHANG);
                            entries.add(RSILING);
                            entries.add(RJUNQI);
                            entries.add(RZHADAN);
                            entries.add(RDILEI);

                            entries.add(ST_STCAMP);
                            entries.add(ST_STBASE);
                            entries.add(ST_CORNER);
                            entries.add(ST_CROSS);
                            entries.add(ST_CROSS_ONE_RAIL );
                            entries.add(ST_LEFT_L_RAIL);
                            entries.add(ST_LEFT_TOP_T_RAIL);
                            entries.add(ST_ONE_RAIL);
                            entries.add(ST_RIGHT_TOP_T_RAIL);
                            entries.add(ST_RIGHT_L_RAIL);
                            entries.add(ST_TLINE);
                            entries.add(ST_TLINE_ONE_RAIL);
                            entries.add(ST_TV_ONE_RAIL);
                            entries.add(ST_V_CROSS_ONE_RAIL);
                            entries.add(ST_V_CROSS_T_RAIL);
                            entries.add(ST_STBLANK);
                        }
                )
                .build()
        );
    }
}


